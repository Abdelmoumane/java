# 🧾 تحليل ملف نصّي باستخدام Java

هذا البرنامج يقوم بـ:

- عدّ عدد **الأسطر** في الملف.
- عدّ عدد **الكلمات**.
- عدّ عدد **الحروف (بدون الفراغات)**.

---

##تحليل ملف نصّي باستخدام Java:

```java
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            // 📌 ضع هنا مسار الملف الخاص بك
            File file = new File("/Users/TXT/fileMix.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;

                // حذف الفراغات الزائدة
                String trimmedLine = line.trim();

                // ✅ عد الكلمات
                if (!trimmedLine.isEmpty()) {
                    String[] words = trimmedLine.split("\\s+");
                    wordCount += words.length;
                }

                // ✅ عد الحروف (بدون المسافات)
                charCount += trimmedLine.replaceAll("\\s+", "").length();
            }

            scanner.close();

            System.out.println("📊 تحليل الملف:");
            System.out.println("عدد السطور: " + lineCount);
            System.out.println("عدد الكلمات: " + wordCount);
            System.out.println("عدد الحروف (بدون فراغات): " + charCount);

        } catch (IOException e) {
            System.out.println("❌ حدث خطأ: " + e.getMessage());
        }
    }
}
