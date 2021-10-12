
package com.mycompany.unidad4practica5;
import java.util.Scanner;
/**
 Se suministran en cms. La altura de todos los alumnos del curso. Se pide calcular e informar cual es la altura
 promedio y cuantos, “en porcentaje”, son mayores al promedio. 
 Pregunta: ¿Podríamos utilizar la resolución para alumnos de otras comisiones?

 */
public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DEL ARRAY");
        int N=scanner.nextInt();
        float[] arr=new float[N];
        float promedio=0,porcentaje=0,suma=0;
        int contador=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("INGRESE LA ALTURA");
            arr[i]=scanner.nextFloat();
            suma+=arr[i];
        }
        promedio=suma/arr.length;//PROMEDIO DE ALTURAS DE UN CURSO
        System.out.println("PROMEDIO de alturas del curso"+promedio);
        
        for(int o =0;o<arr.length;o++){
            if(promedio<arr[o]){
                contador++;//CUENTO LOS CHICOS MAS ALTOS.
            }
        }
        porcentaje=(contador*100)/arr.length;//PORCENTAJE REGLA DE 3 . SI N DATOS INGRESADOS
                                             //ENTONCES CONTADOR DE ALTOS *100 DIVIDIDO N DATOS INGRESADOS.
        System.out.println(porcentaje+" % DE LOS MAS ALTOS");
    }
}
