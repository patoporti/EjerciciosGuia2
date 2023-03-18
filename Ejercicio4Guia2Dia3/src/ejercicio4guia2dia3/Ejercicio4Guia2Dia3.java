/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia2dia3;

import java.util.Scanner;

/**
 *
 * @author Pato Portillo
 */
public class Ejercicio4Guia2Dia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    /*Dada una cantidad de grados centígrados se debe mostrar 
    su equivalente en grados Fahrenheit. 
    la fórmula correspondiente es: F = 32 + (9 * C / 5).  */
    
    float C;
    
    System.out.println("Buenas tardes, ingrese los grandos C: ");
    
    C = leer.nextByte();
    
    float F = 32 + (9 * C / 5);
    
    System.out.println("La conversion es: "+ F );
    
    }
    
}
