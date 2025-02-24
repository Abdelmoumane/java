## Java Program to Extract Digits from a String

Este programa en Java solicita al usuario que ingrese una cadena de texto y luego extrae todos los dígitos que contiene, si los hay.

### Código en Java:

```java
import java.util.Scanner;

public class JavaFx {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce cadena:");
        
        String nom = scan.nextLine();
        
        StringBuilder st = new StringBuilder();
        
        // Recorremos cada carácter de la cadena
        for (char ch : nom.toCharArray()) {
            
            // Si el carácter es un dígito, lo agregamos a 'st'
            if (Character.isDigit(ch)) {
                st.append(ch);
            }
        }

        // Si se encontraron dígitos, los mostramos
        if (st.length() > 0) {
            System.out.println("El número es: " + st); 
        }
    }
}
