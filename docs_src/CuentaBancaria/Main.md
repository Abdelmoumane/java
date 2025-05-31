/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author abdelmoumen
 */
public class Main {
    
    



    public static void main(String[] args) {
        
      
   
        
       CuentaCorriente corre = new CuentaCorriente ("wn123",1200);
       CuentaAhorro ahorro = new CuentaAhorro ("ssn66",400);
       
       
    
       corre.traspasar(ahorro, 500);
       
       
        System.out.println(corre);
        System.out.println(ahorro);
        
        

        
    }
}