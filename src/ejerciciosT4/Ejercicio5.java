/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosT4;
import java.util.Scanner;
import static java.lang.Math.PI;
/**
 *
 * @author ferjua
 */
public class Ejercicio5 {
    public static void main (String[] args){
        double radio;
        double longitud;
        double volumen;
        double area;
        
        System.out.println("Introduce el radio de la circunferencia: ");
        Scanner entrada = new Scanner(System.in);
        radio = entrada.nextDouble();
        
        longitud = (radio*2) * PI;
        area = Math.pow(radio,2)*PI;
        volumen = 4/3 * PI * Math.pow(radio,3);
        
        System.out.println("La longitud de la circunferencia es igual a: " + longitud);
        System.out.println("El area del circulo es igual a: " + area);
        System.out.println("El volumen de la esfera es igual a:" + volumen);
    }
}
