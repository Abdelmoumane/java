/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author abdelmoumen
 */
public class CuentaAhorro  extends CuentaBancaria{
    
   private  int saldoMinimo ;

    public CuentaAhorro(String iban, int saldo) {
        super(iban, saldo);
    }

       @Override
    public void calcularIntereses() {
        
        
        if (saldoMinimo < 1000){
            
            
        System.out.println(saldo*(CuentaBancaria.getInteresAnualBasico()/2));        
            
        }else{
        

        
        System.out.println(saldo*(CuentaBancaria.getInteresAnualBasico()*2));        
        
    }
    
   
    }
   
   
}
