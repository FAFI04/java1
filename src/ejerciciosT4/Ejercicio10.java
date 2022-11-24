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
public class Ejercicio10 {
    public static void main (String[] args){
        double num1;
        double num2;
        double suma;
        double resta;
        double mult;
        double div;
        
        System.out.println("Introduce 1 número: ");
        Scanner entrada1 = new Scanner(System.in);
        num1 = entrada1.nextDouble();
        
        System.out.println("Introduce 1 número, que no sea 0 por favor: ");
        Scanner entrada2 = new Scanner(System.in);
        num2 = entrada2.nextDouble();
        
        suma = num1+num2;
        resta = num1-num2;
        mult = num1*num2;
        div = num1/num2;
        
        System.out.println("El valor de la suma es igual a: " + suma);
        System.out.println("El valor de la resta es igual a: " + resta);
        System.out.println("El valor de la multiplicacion es igual a: " + mult);
        System.out.println("El valor de la division es igual a: " + div);
    }
}
