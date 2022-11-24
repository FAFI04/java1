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
public class Ejercicio17 {
    public static void main (String[] args){
        int hora;
        int minuto;
        int segundo;
        
        System.out.println("Introduce una hora entre 00 y 23 ");
        Scanner entrada1 = new Scanner(System.in);
        hora = entrada1.nextInt();
         
        System.out.println("Introduce un minuto entre 00 y 59 ");
        Scanner entrada2 = new Scanner(System.in);
        minuto = entrada2.nextInt();
        
        System.out.println("Introduce un segundo entre 00 y 59 ");
        Scanner entrada3 = new Scanner(System.in);
        segundo = entrada3.nextInt();
        
        if (hora<00 || hora>23){
            System.out.println("ERROR¡ La hora debe estar entre las 00 y las 23");
                if (minuto<00 || minuto>59)
                    System.out.println("ERROR¡ Los minutos deben estar entre 00 y 59");
                        if (segundo<00 || segundo>59)
                            System.out.println("ERROR¡ Los segundos deben estar entre 00 y 59");
        }else{
        
            segundo=segundo+1;
            
            if (segundo == 60){
                
                segundo=00;
                minuto=minuto + 1;
                    
            
                if (minuto==60){
                    
                    minuto=00;
                    hora=hora + 1;
                                
                        
                    if (hora==24){
                                    
                           
                        hora=00;
                                
                    } System.out.println("La hora es"+hora+"Los minutos son"+minuto+"Los segundos son"+segundo);
            }
                    
        }
        } 

 
    }
}
