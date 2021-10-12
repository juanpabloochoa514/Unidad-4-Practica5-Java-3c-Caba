package com.mycompany.unidad4practica5;

/**
Realice un algoritmo para desplazar los valores de los elementos de un arreglo de enteros una posición hacia la 
derecha. Rellenado con ceros a la izquierda.
Por ejemplo: Si el arreglo contiene {2, 3, 4, 5, 6} entonces debe quedar {0, 2, 3, 4, 5}
 */
public class Ej16 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int auxiliar=0;
        for (int i = 0; i < arr.length - 4; i++) {//NO ENTIENDO CUANTOS VECES DEBO HACER EL CORRIMIENTO PARA 
            //RELLENAR DE 0 S 
            if (arr[i] < arr[i + 1]) {
                auxiliar = arr[i];
                arr[i] = arr[i+1];
                arr[i + 1] = auxiliar;
            }
            arr[i]=0;
        }
       
       
        System.out.println(" SERIA ASI ");
        for (int imprimir = 0; imprimir < arr.length; imprimir++) {
            System.out.print("   " + arr[imprimir]+"    ");
        }
       

    }
}
