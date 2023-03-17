/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia2dia3;

import java.util.Scanner;

/**
 *
 * @author Pato Portillo
 */
public class Ejercicio5Guia2Dia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
  //Escribir un programa que lea un número entero por 
  //y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
  //Nota: investigar la función Math.sqrt().
       System.out.println("Ingrese un num: ");
     int num;
     num = leer.nextByte();
     
   
    System.out.println("El doble es: " + num *2 + ". El triple es: " + num *3);
      
    System.out.println("La raiz cuadrada es: "+ Math.sqrt(num));
      

     
     
     
     
     
            
             
     
    }
    
}
