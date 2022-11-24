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
public class Ejercicio8 {
    public static void main (String[] args){
        int edad;
        
        System.out.println("¿Cuantos años tienes?: ");
        Scanner entrada = new Scanner(System.in);
        edad = entrada.nextInt();
        
        if (edad>=18)
        { System.out.println("Eres mayor de edad.");
        } else 
        { System.out.println("Eres menor de edad.");
        }
    }
}
