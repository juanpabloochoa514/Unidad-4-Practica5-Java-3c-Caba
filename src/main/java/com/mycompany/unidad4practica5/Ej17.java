package com.mycompany.unidad4practica5;

/**
Idem 10, pero desplazando una posición hacia la izquierda rellenando con 0 ceros a la derecha.
Por ejemplo: Si el arreglo contiene {2, 3, 4, 5, 6} entonces debe quedar {3, 4, 5, 6, 0}
¿Cómo cambiaría el algoritmo si quiero desplazar 2 posiciones en vez de una?

 */
public class Ej17 {
     public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int auxiliar=0;
        for (int i =1; i < 5; i++) {
            arr[i-1] = arr[i];
            arr[i] = 0;
        }
        for (int imprimir = 0; imprimir < 5; imprimir++) {
            System.out.print("  " + arr[imprimir]+"  ");
        }
        //DESPLAZANDO DOS POSICIONES.
         System.out.println("    ");
         System.out.println("    ");
         System.out.println("    ");
         System.out.println("    ");
        for (int p =1;p < 4; p++) {
            arr[p-1] = arr[p];
            arr[p] = 0;
        }
        for (int imprimir1 = 0; imprimir1 <5; imprimir1++) {
            System.out.print("  " + arr[imprimir1]+"  ");
        }
    }
}
