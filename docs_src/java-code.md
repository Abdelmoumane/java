# Java Program to Count Vowels

Este programa en Java solicita al usuario que ingrese una cadena de texto y luego cuenta cuántas vocales (minúsculas 'a', 'e', 'i') contiene.

## Código en Java:

```java
import java.util.Scanner;

public class JavaFx { 
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("introduce cadena");

        String numbre = scan.nextLine();

        int contadorVocales = 0;

        for ( char ch : numbre.toCharArray())

            if ("aei".indexOf(ch) != -1){
                contadorVocales++;
            }

        System.out.println("La palabra tiene " + contadorVocales + " vocales.");
    }
}
