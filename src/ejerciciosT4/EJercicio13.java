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
public class EJercicio13 {
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
             if (num1<num2)
             {
                System.out.println("El primero es "+ num2 + " el segundo es " + num1);
             }
             else
             { 
                 System.out.println("El primero es "+ num1 + " el segundo es " + num2);
             }
        } 
        
    }
}
