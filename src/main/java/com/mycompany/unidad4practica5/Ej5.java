
package com.mycompany.unidad4practica5;
import java.util.Scanner;

public class Ej5 {
    //Se tienen 100 datos que representan el peso de la misma cantidad de niños que hay internados en un hospital.
    //Dichos datos se encuentra almacenados en un arreglo y se desea procesarlo para confeccionar la siguiente
    //tabla:
    /*
    Entre 0,000 y 10,000 Kg. 	hay ............. niños.
    Entre 10,001 y 20,000 Kg. 	hay ............. niños.
    Entre 20,001 y 30,000 Kg. 	hay ............. niños.
    De más de 30,000 Kg. 	      hay ............. niños.
*/
    
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
        System.out.println("AGREGUE EL TAMAÑO DEL VECTOR");
        int N=scanner.nextInt();
        int[] arrhospital=new int[N];
        for(int var=0;var<arrhospital.length;var++){
            System.out.println("AGREGAR VARIABLE ");
            arrhospital[var]=scanner.nextInt();
        }
        int contador1=0,contador2=0,contador3=0,contador4=0;
        for(int i=0;i<arrhospital.length;i++){//PRESUPONGO QUE EL ARREGLO ESTA CON DATOS.
            if(arrhospital[i]>0 && arrhospital[i]<=10){
                contador1++;
               
            }else if(arrhospital[i]>=10 && arrhospital[i]<=20){
                contador2++;
                
            }else if(arrhospital[i]>=20 && arrhospital[i]<30){
                contador3++;
                
            }else if(arrhospital[i]>=30){
                contador4++;
                
            }
            
            
        }
         System.out.println(" Entre 0,000 y 10,000 Kg. hay  "+contador1+" niños ");
         System.out.println(" Entre 10,001 y 20,000 Kg. hay  "+contador2+" niños ");
         System.out.println("Entre 20,001 y 30,000 Kg. hay  "+contador3+" niños ");
         System.out.println("De más de 30,000 Kg. hay  "+contador4+" niños ");
        
    }
}
