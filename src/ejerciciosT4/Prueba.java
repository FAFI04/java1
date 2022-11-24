/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosT4;
import java.util.Scanner;
/**
 *
 * @author ferjua
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        System.out.println("Dame un numero entre 0 y 10");
        nota = entrada nextInt();
        if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        } 
        
    }
    
}
