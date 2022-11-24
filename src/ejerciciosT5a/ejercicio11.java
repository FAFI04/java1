/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosT5a;

/**
 *
 * @author ferjua
 */
public class ejercicio11 {
    public static void main (String[]args){
        
        int sumapar=0;
        int sumaimpar=0;
        
        for(int par=100; par<=200; par=par+2){
            sumapar=sumapar+par;
            System.out.println("par="+sumapar);
        }
        for(int impar=101; impar<=199; impar=impar+2){
            sumaimpar=sumaimpar+impar;
            System.out.println("impar"+sumaimpar);
        }
    }
}
