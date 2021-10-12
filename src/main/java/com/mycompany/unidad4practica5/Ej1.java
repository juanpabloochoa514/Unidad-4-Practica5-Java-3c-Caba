
package com.mycompany.unidad4practica5;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Realice un algoritmo para cargar valores en un arreglo de elementos de tipo entero, cuyo tamaño o capacidad 
        //está definido por una constante N.
        System.out.println("CANTIDAD DEL VECTOR");
        int N=scanner.nextInt();
        int[]arr =new int [N];
        
        for(int i = 0 ;i<arr.length;i++){
            System.out.println("INGRESE UN VALOR ENTERO ");
            arr[i]=scanner.nextInt();
        }
        for(int o =1;o<arr.length;o++){
            System.out.println("VALOR  "+arr[o]);
        }
        scanner.close();
    }
}
