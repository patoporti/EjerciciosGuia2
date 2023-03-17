/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1dia3guia2;

import java.util.Scanner;

/**
 *
 * @author Pato Portillo
 */
public class Ejercicio1Dia3Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    Scanner leer = new Scanner (System.in);
         /*Ejericio1:
    Escribir un programa que pida dos números enteros por teclado y
    calcule la suma de los dos. El programa deberá después mostrar 
    el resultado de la suma*/
    
    int num1;
    int num2;
        System.out.println("Ingrese 2 numeros para sumarlos");
    num1 = leer.nextByte();
    num2 = leer.nextByte();
    int suma = num1 + num2;
        System.out.println("la suma es: " + suma);
    }
    
}
