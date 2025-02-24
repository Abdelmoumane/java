## Java Program to Count Vowels

Este programa en Java solicita al usuario que ingrese una cadena de texto y luego cuenta cuántas vocales (minúsculas 'a', 'e', 'i') contiene.

### Código en Java:

```java
import java.util.Scanner;

public class JavaFx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce cadena:");

        String numbre = scan.nextLine();

        int contadorVocales = 0;

        // Recorremos cada carácter de la cadena
        for (char ch : numbre.toCharArray()) {
            // Si el carácter es una vocal, aumentamos el contador
            if ("aei".indexOf(ch) != -1) {
                contadorVocales++;
            }
        }

        // Imprimimos la cantidad de vocales encontradas
        System.out.println("La palabra tiene " + contadorVocales + " vocales.");
    }
}
