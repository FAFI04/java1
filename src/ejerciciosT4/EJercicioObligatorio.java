/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosT4;
import java.util.Scanner;
/**
 *
 * @author Ferran Sebastia
 */
public class EJercicioObligatorio {
    public static void main (String[] args){
        int dia;
        int mes;
        int año;
                
        //Leo el dia, mes, año
        
        System.out.println("Introduce una dia entre 1 y 31 segun el mes que introduzcas, algunos meses tienen 31, 30 o febrero 28 dias. ");
        Scanner entrada1 = new Scanner(System.in);
        dia = entrada1.nextInt();
        
        System.out.println("Introduce un mes entre 1 y 12 ");
        Scanner entrada2 = new Scanner(System.in);
        mes = entrada2.nextInt();
        
        System.out.println("Introduce un año ");
        Scanner entrada3 = new Scanner(System.in);
        año = entrada3.nextInt();       
        
        //compruebo que esos dias mes y año sean validos
        
        if(dia>31 || dia<1){
            System.out.println("El dia introducido no es valido. ");
        }
        
        if(mes>12 || mes<1){
            System.out.println("El mes introducido no es valido.");
        }
           
        if (dia>28 && (mes==2)){
            System.out.println("!Febrero solo tiene 28 dias¡");
        }
        
        if (dia>30 && (mes==4 || mes==6 || mes==9 || mes==11)){
            System.out.println("El mes introducido solo tiene 30 dias");
        }
        
        //sumo los 7 dias, actualizo la fecha y compruebo que es correcta
        
        dia=dia+7;
        
        if (dia>31 && mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            mes=mes+1;
            dia=dia-31;
            System.out.println("dia " +dia+ " del "+mes+ " del "+año);
                }if (mes>=13){
                    mes=mes+1;   
                }else{
                }if (dia>30 && mes==4 || mes==6 || mes==9 || mes==11){
                            mes=mes+1;
                             dia=dia-30;
                                System.out.println("dia " +dia+ " del "+mes+ " del "+año);
                 }else{
                if (dia>28 && mes==2){
                     mes=mes+1;
                     dia=dia-28;
                     System.out.println("dia "+dia+" del "+mes+" del "+año);
               }
           }
        
        
        
        
    }   
}
