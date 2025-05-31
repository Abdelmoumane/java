/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author abdelmoumen
 */
  public class  CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String iban, int saldo) {
        super(iban, saldo);
    }

    @Override
    public void calcularIntereses() {
        
        
        System.out.println(saldo*CuentaBancaria.getInteresAnualBasico());        
    }
     
 
 
 

}
    