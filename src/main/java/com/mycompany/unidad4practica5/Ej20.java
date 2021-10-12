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
        for (int i = 0; i < arr.length / 2; i++) {//recorro el array hasta la mitad
            auxiliar = arr[i];//numero de la izquierda lo guardo en un aux
            arr[i] = arr[arr.length - 1 - i];//por buenas practicas length-1 menos una vuelta de i //tiro el valor a la izquierda
            arr[arr.length - 1 - i] = auxiliar;//guardo en una variable el valor de la derecha
            
        }
        
        
        for(int o = 0 ;o < arr.length;o++){
            System.out.print("  " + arr[o] + "  ");
        }
        
    }
 
}
