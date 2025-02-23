
//Escribe un programa en Java que solicite al usuario ingresar una palabra y cuente cuántas vocales contiene.


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
   
     

