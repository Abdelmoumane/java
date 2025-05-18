
Este programa invierte una cadena de texto dada. Utiliza un ciclo for que recorre la cadena desde el último carácter hasta el primero, concatenando cada carácter en una nueva cadena para mostrar el resultado invertido. Por ejemplo, convierte "hello" en "olleh".


### Invertir una cadena en Java.:


```java

public static void main(String[] args) {
    String a = "hello";
    String b = "";

    for (int i = a.length() - 1; i >= 0; i--) {
        b += a.charAt(i);
    }

    System.out.println(b); // print: olleh
}
