/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia2dia3;

import java.util.Scanner;

/**
 *
 * @author Pato Portillo
 */
public class Ejercicio3Guia2Dia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    
    //Ejercicio3:Escribir un programa que pida una frase 
    //y la muestre toda en mayúsculas y después toda en minúsculas.  
    
    String frase;
        System.out.println("Ingrese una frase: ");
        frase = leer.next();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
