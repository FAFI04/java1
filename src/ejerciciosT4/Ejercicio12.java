/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosT4;
import java.util.Scanner;

/**
 *
 * @author ferjua
 */
public class Ejercicio12 {
    public static void main (String[] args){
         double num;
         
         System.out.println("Introduce 1 numero: ");
         Scanner entrada = new Scanner(System.in);
         num = entrada.nextDouble();
    
         if (num<0)
         { 
             System.out.println("Es un numero negativo");
         }
         else {
            System.out.println("Es un numero positivo"); 
        } 
        
    }
}
