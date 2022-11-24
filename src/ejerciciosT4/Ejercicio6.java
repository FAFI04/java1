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
public class Ejercicio6 {
    public static void main (String[] args){
        double precio;
        double venta;
        double descuento;   
        double porcentaje; 
                
        System.out.println("Introduce el precio del articulo: ");
        Scanner entrada1 = new Scanner(System.in);
        precio = entrada1.nextDouble();
        
        System.out.println("Introduce el precio de venta del articulo: ");
        Scanner entrada2 = new Scanner(System.in);
        venta = entrada2.nextDouble();
        
        descuento = venta-precio;
        porcentaje = (descuento/precio) *100;
        
        System.out.println("El tanto porciento del descuento aplicado es igual a: " + porcentaje);
    }
}
