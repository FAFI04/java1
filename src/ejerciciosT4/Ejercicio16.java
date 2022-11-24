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
public class Ejercicio16 {
    public static void main (String[] args){
        double nota;
        
        System.out.println("Introduce una nota entre 0 y 10: ");
         Scanner entrada1 = new Scanner(System.in);
         nota = entrada1.nextDouble();
             
         if (nota>10 || nota<0){
             System.out.println("Las notas deben estar entre 0 y 10");
        }else
        {
            if (nota<3){
                System.out.println("Muy deficiente");
            }else{
                if (nota<5){
                    System.out.println("Insuficiente");
                }else{
                    if (nota<6){
                        System.out.println("Bien");
                    }else{
                        if (nota<9){
                            System.out.println("Notable");
                        }else{
                            if (nota<=10){
                                System.out.println("Sobresaliente");
                            }
                        }
                    }
                }
            }
            
        }
    }
}
