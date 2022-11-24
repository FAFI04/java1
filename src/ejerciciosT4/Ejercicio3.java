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
public class Ejercicio3 {
    public static void main (String[] args){
        
        double lado;
        double area;
                
        System.out.println("Introduce el valor del lado del cuadrado: ");
        Scanner ladocuadrado = new Scanner(System.in);
        lado = ladocuadrado.nextDouble();
        
        area = lado*lado;
        
        System.out.println("El area del cuadrado es: " + area);
    }
}
