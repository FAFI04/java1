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
public class Ejercicio4 {
    public static void main (String[] args){
        double num1;
        double num2;
        double suma;
        double resta;
        double mult;
        double div;
               
        System.out.println("Introduce un número: ");
        Scanner primero = new Scanner(System.in);
        num1 = primero.nextDouble();
        
        System.out.println("Introduce otro número más: ");
        Scanner segundo = new Scanner(System.in);
        num2 = segundo.nextDouble();
        
        suma = num1+num2;
        resta = num1-num2;
        mult = num1*num2;
        div = num1/num2;
        
        System.out.println("La suma de tus dos números es: " +suma);
        System.out.println("La resta de tus dos números es: " +resta);
        System.out.println("La multipicación de tus dos números es: " +mult);
        System.out.println("La división de tus dos números es: " +div);
    }
}
