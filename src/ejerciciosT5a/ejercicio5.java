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
public class ejercicio5 {
    public static void main (String[]args){
        int N;
        int cont=1;
        int factorial=1;
        
        System.out.println("Introduce un numero");
        Scanner entrada = new Scanner(System.in);
        N = entrada.nextInt();
        
        do
        {
            cont++;
            factorial=factorial*cont;
            System.out.println(factorial);
        }while (cont<N);


    }
}
