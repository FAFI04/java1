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
public class ejercicio10 {
    public static void main (String []args){
        double nota;
        
       
        Scanner entrada = new Scanner(System.in);
        
        
        do
        {
            System.out.println("Introduce notas");
            nota = entrada.nextDouble();
            
            if(nota==10){
                System.out.println("Tengo un 10");
            }
            
        }while (nota!=-1);
        {
        }
    }
}
