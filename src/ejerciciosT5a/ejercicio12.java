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
public class ejercicio12 {
    public static void main (String[]args){
        double a;
        double b;
        double cont=0;
        double potencia=1;
        
        System.out.println("introduce un numero a");
        System.out.println("introduce un numero b");
        Scanner entrada = new Scanner(System.in);
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        
        do
        {
          cont++;
          potencia=potencia*a;
            System.out.println("el resultado es "+potencia);
        }while (cont!=b);
        {   
        }
    }
}
