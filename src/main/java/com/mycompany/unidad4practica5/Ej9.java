
package com.mycompany.unidad4practica5;

import java.util.Scanner;

/**
Realice un algoritmo para determinar la cantidad de veces que se repite un “1” dentro arreglo de elementos de 
tipo int. ¿Qué semejanzas tiene este algoritmo con el anterior? ¿Se puede usar este algoritmo para resolver el
problema anterior?
 */
public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DEL ARRAY ");
        int N=scanner.nextInt();
        int[] arr = new int[N];
        int contador=0;
        for(int o =0;o<arr.length;o++){
            System.out.println("INGRESE EL VALOR ENTERO");
            arr[o]=scanner.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==1){
                System.out.println("SE ENCONTRO EL 1 EN LA POSICION"+i);
                contador++;    
            }
        }
        System.out.println("LA CANTIDAD DE VECES QUE SE REPITE EL 1 =  "+contador);
    }
}
