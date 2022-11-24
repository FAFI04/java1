/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosT5a;
import java.util.Scanner;
/**
 *
 * @author ferjua
 */
public class ejercicio14 {
    public static void main (String []args){
        int valor;
        int billete500=0;
        int billete200=0;
        int billete100=0;
        int billete50=0;
        int billete20=0;
        int billete10=0;
        int billete5=0;
        
        System.out.println("Introduce un multiplo de 5");
        Scanner entrada = new Scanner(System.in);
        valor = entrada.nextInt();
        
        while (valor%5!=0){
            
            System.err.println("Introduce un multiplo de 5 por favor");
            valor = entrada.nextInt();
        }
        while (valor>=500){
            billete500++;
            System.out.println(billete500+" billetes de 500");
        }
        while (valor>=200){
            billete200++;
            System.out.println(billete200+" billetes de 200");
        }
        while (valor>=100){
            billete100++;
            System.out.println(billete100+" billetes de 100");
        }
        while (valor>=50){
            billete50++;
            System.out.println(billete50+" billetes de 50");
        }
        while (valor>=20){
            billete20++;
            System.out.println(billete20+" billetes de 20");
        }
        while (valor>=10){
            billete10++;
            System.out.println(billete10+" billetes de 10");
        }
        while (valor>=5){
            billete5++;
            System.out.println(billete5+" billetes de 5");
        }
    }}
