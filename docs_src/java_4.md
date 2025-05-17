## Java Program to Extract Digits from a String

Añadir lógica para ordenar notas y encontrar la nota máxima



### Añadir lógica para ordenar notas y encontrar la nota máxima.:


```java

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce las notas:");

        int arr[] = new int[3];

        // Input notes
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        // Find maximum
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Sort array in ascending order using bubble sort
        boolean sort;
        int temp;
        do {
            sort = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sort = true;
                }
            }
        } while (sort);

        // Display sorted notes
        System.out.println("Ordenar las notas de menor a mayor:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        // Display max note
        System.out.println("\nLa nota máxima es: " + max);
    }
}
