/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosT5a;
/**
 *
 * @author ferjua
 */
public class ejercicio9 {
    public static void main (String []args){
        int NS=0;//numero suma
        int NM=1;//numero multiplicacion
        int suma=0;
        int mult=1;
        
        for (int cont=0; cont<=10; cont++){
            suma=suma+NS;
            System.out.println("suma= "+suma);
            NS++;
            
            mult=mult*NM;
            System.out.println("Multiplicacion= "+mult);
            NM++;
        }
    } 
}
