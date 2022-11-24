/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciost5_string;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author ferjua
 */
public class ejercicio1 {
    public static void String (String[]args){
        String cadena="";
        int vocales=0;
        char letra;
        
        System.out.println("Introduce una frase");
        Scanner entrada = new Scanner(System.in);
        cadena = entrada.readLine();
        
        
        for (int i=0,i<cadena.lenght, i++){
            letra = cadena.chatAt(i);
            vocales++;
            System.out.println(vocales);
        }
    }
}
