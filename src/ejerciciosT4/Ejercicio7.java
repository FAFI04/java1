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
public class Ejercicio7 {
        public static void main (String[] args){
            double millas_marinas;
            double metros;
            
            System.out.println("Introduce un valor numerico: ");
            Scanner entrada = new Scanner(System.in);
            millas_marinas = entrada.nextDouble();
            
            metros = millas_marinas * 1852;
                    
            System.out.println(millas_marinas +" Millas marinas son "+ metros + " m");
        }   

}
