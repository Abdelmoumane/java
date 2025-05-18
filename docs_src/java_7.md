## Concatenador de Iniciales para Código de Usuario

Este proyecto en Java solicita al usuario ingresar su nombre y dos apellidos desde teclado, y genera un código de usuario compuesto por las tres primeras letras de cada entrada (en mayúsculas).
Ejemplo: si el usuario introduce "Lionel", "Tarazón" y "Alcocer", el resultado será LIOTARALC.

El programa incluye validación de longitud para evitar errores con entradas menores de tres letras. Ideal para practicar el manejo de cadenas y entrada por teclado en Java.


### Concatenador de Iniciales para Código de Usuario.:


```java

import java.util.Scanner;

public class CodigoUsuario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("أدخل الاسم: ");
        String nombre = scan.nextLine();

        System.out.print("أدخل اسم العائلة الأول: ");
        String apellido1 = scan.nextLine();

        System.out.print("أدخل اسم العائلة الثاني: ");
        String apellido2 = scan.nextLine();

        String parteNombre;
        if (nombre.length() >= 3) {
            parteNombre = nombre.substring(0, 3);
        } else {
            parteNombre = nombre;
        }

        String parteApellido1;
        if (apellido1.length() >= 3) {
            parteApellido1 = apellido1.substring(0, 3);
        } else {
            parteApellido1 = apellido1;
        }

        String parteApellido2;
        if (apellido2.length() >= 3) {
            parteApellido2 = apellido2.substring(0, 3);
        } else {
            parteApellido2 = apellido2;
        }

        String codigoUsuario = (parteNombre + parteApellido1 + parteApellido2).toUpperCase();

        System.out.println("رمز المستخدم الخاص بك هو: " + codigoUsuario);

        scan.close();
    }
}
