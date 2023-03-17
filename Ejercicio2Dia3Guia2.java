/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2dia3guia2;

import java.util.Scanner;

/**
 *
 * @author Pato Portillo
 */
public class Ejercicio2Dia3Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        
        /*Ejericio2:Escribir un programa que pida tu nombre, 
    lo guarde en una variable y lo muestre por pantalla.*/
    
    String nombre;
    System.out.println("Ingrese su nombre: ");
    nombre = leer.next();
    System.out.println("Gracias! " + nombre );
    }
    
}
