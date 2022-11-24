/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosT5a;
import java.util.Scanner;
/**
 *
 * @author ferjua
 */
public class ejercicio8 {
    public static void main (String []args){
        int n;
        int contN=0;
        int contP=0;
        
        Scanner entrada = new Scanner (System.in);
        
        do
        {
            System.out.println("Introduce numeros");
            n = entrada.nextInt();
            
            if(n<0){
                contN++;
                System.out.println("He leido un negativo");
                System.out.println("Hay "+contN+" numeros negativos");
            }
            if(n>0){
                contP++;
                System.out.println("Hay "+contP+" numeros positivos");
                }
            
        }while (n!=0);
        {
        }
            
    }
}
