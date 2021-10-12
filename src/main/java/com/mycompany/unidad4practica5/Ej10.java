
package com.mycompany.unidad4practica5;
import java.util.Scanner;
/**
 Realice un algoritmo para sumar elemento a elemento, los elementos de dos arreglos de enteros (de la misma 
 cantidad) y retorne el resultado en un arreglo que contenga los resultados de dicha suma.
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DEL ARRAY ");
        int N=scanner.nextInt();
        int[] arr1=new int[N];
        int[] arr2=new int[N];
        int[] arrresult=new int[N];
       
        for(int i=0;i<N;i++){
            System.out.println("ingrese valores para el primer array");
            arr1 [i]=scanner.nextInt();
            System.out.println("ingrese valores para el segundo array");
            arr2 [i]=scanner.nextInt();
            arrresult[i]=arr1[i]+arr2[i];
        }
        for(int o = 0;o<N;o++){
            System.out.println("RESULTADO DE LA SUMA DE ENTRE DOS VECTORES ES "+arrresult[o]+"  POSICION  "+o);
        }
    }
}
