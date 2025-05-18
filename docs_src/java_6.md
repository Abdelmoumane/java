## Comparación de Arrays en Java



Este programa en Java solicita al usuario ingresar 20 números enteros. Los primeros 10 se almacenan en un array y los últimos 10 en otro. Luego, ambos arrays se comparan elemento por elemento para determinar si son iguales o no. Incluye visualización de los datos ingresados y el resultado de la comparación.


### Comparación de Arrays en Java

.:


```java

import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean equal = true;

        int[] arr1 = new int[10]; // Primer array para los primeros 10 números
        int[] arr2 = new int[10]; // Segundo array para los últimos 10 números

        System.out.println("Introduce los 20 números enteros:");

        // Leer los primeros 10 números del usuario
        System.out.println("Introduce los primeros 10 números:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }

        // Leer los últimos 10 números del usuario
        System.out.println("Introduce los últimos 10 números:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }

        // Mostrar los valores del primer array
        System.out.print("Primer array: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Mostrar los valores del segundo array
        System.out.print("Segundo array: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Comparar ambos arrays elemento por elemento
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                equal = false; // Si hay una diferencia, no son iguales
                break;         // Salir del bucle porque ya sabemos que son diferentes
            }
        }

        // Mostrar si los arrays son iguales o no
        if (equal) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays no son iguales.");
        }
    }
}
