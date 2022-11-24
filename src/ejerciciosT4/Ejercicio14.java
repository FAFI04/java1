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
public class Ejercicio14 {
    public static void main (String[] args){
         double num1;
         double num2;
         
         System.out.println("Introduce 1 numero: ");
         Scanner entrada1 = new Scanner(System.in);
         num1 = entrada1.nextDouble();
         
         System.out.println("Introduce 1 numero: ");
         Scanner entrada2 = new Scanner(System.in);
         num2 = entrada2.nextDouble();
         
         if (num1==num2)
         { 
             System.out.println("Son los mismos numeros");
         }
         else 
         {
             if (num1>=num2)
             {
                 System.out.println("El mayor es "+ num1 + " el menor es " + num2);
             }
             else
             {
                 System.out.println("El mayor es "+ num2 + " el menor es " + num1);
             }
        } 
        
    }
}
