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
public class ejercicio4 {
    public static void main (String[] args){
        int N;
        
        System.out.println("Introduce un Numero");
        Scanner entrada = new Scanner(System.in);
        N = entrada.nextInt();
        
        for (int cont=1; cont<=N; cont++){
            System.out.println(cont);
        }
    }
}
