/*
Realice un algoritmo para desplazar los valores de los elementos de un arreglo de enteros una posición hacia la 
derecha de forma circular, es decir haciendo que el primero desde la derecha (“último”) quede como el primero
de la izquierda (“primero”).
Por ejemplo: Si el arreglo contiene {2, 3, 4, 5, 6} entonces debe quedar {6, 2, 3, 4, 5}
¿Cómo cambiaría el algoritmo si quiero desplazar 2 posiciones en vez de una?

 */
package com.mycompany.unidad4practica5;


public class Ej20 {
    public static void main(String[] args) {
        int[] arr={2, 3, 4, 5, 6};
        int auxiliar=0;
        
        
        for (int i =arr.length-1; i >0; i--) {
            auxiliar=arr[i-1];
            arr[i-1]=arr[i];
            arr[i]=auxiliar;
        }
        
        
        for(int o = 0 ;o < arr.length;o++){
            System.out.print("  " + arr[o] + "  ");
        }
        
    }
 
}
