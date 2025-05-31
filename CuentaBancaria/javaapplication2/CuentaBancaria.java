/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author abdelmoumen
 */
public abstract class CuentaBancaria {
    
    private String iban;
      int saldo;
     private static final int interesAnualBasico =5;
    
    
    
    public CuentaBancaria (String iban,int saldo){
        
        
       this.iban=iban;
       this.saldo=saldo;
        
    }
    
    

    public String getIban() {
        return iban;
    }

    public static int getInteresAnualBasico() {
        return interesAnualBasico;
    }

   

    public int getSaldo() {
        return saldo;
    }

   
    public void ingresar (int ingres){
        
       anadir(ingres);
       
        
    }
    
    public void retirar (int tirar){
        
        
        
        if (tirar > saldo){
            
            System.out.println("saldo insifison para tirar");
        }else{
            
             anadir(-tirar);
            
        }
        
    }
    
    public void traspasar (CuentaBancaria destino,int amount){
        
        if (amount >saldo ){
            
               System.out.println("saldo insifison para transpasar");

        } else{
            
            
          anadir(-amount);
          destino.anadir(amount);
            
        }
        
        
    }
    
    
    public void anadir (int anadir){
        
            
            
        saldo+=anadir;
        
    }
    
    
    
    public abstract void calcularIntereses();

    
    

    @Override
    public String toString() {
        return "CuentaBancaria{" + "iban=" + iban + ", saldo=" + saldo + '}';
    }
    
   
    
}

