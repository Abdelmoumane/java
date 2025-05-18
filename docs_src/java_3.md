

Función que reciba un array y devuelva el mayor elemento.


### Función que reciba un array y devuelva el mayor elemento.:

```java
public class JavaApplication2 {
    
    
    public static void arr (int [] array  ){
        
        
        int max=array[0];
        
        for (int i = 0; i < array.length; i++) {
            
            if (array[i] > array[0]){
                
                
                
                max = array[i];
            }
            
        }
        
        System.out.println(max);
        
    }


    public static void main(String[] args) {
        
       
        
        int numbers [] = {2,5,9,33,1};
        
        
     JavaApplication2.arr(numbers);

        
        

            
     }
   
        
    }
