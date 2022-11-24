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
public class ejercicio6 {
    public static void main (String []args){
        int N;
        int cont=0;
        int contN=0;
        int contP=0;
        
        Scanner entrada = new Scanner (System.in);

        
        while (cont<10)
        {
            System.out.println("Introduce un numero");  
            N = entrada.nextInt();
            
            cont++;
            
            if(N<0){
                contN++;
                System.out.println("Hay "+contN+ " numeros negativos.");
            }else{
                contP++;
                System.out.println("Hay "+contP+" numeros positivos.");
            }
        }
            
    }
}

