
package com.mycompany.unidad4practica5;

/**
¿Qué pasa si quiero eliminar el elemento de un arreglo? ¿Es posible hacer esto? ¿Y si quiero intercambiar la
posición de dos elementos? Recuerde: Una cosa son los elementos, otra cosa, es el valor que almacena cada 
elemento.
 */
public class Ej13 {
    public static void main(String[] args) {
        int[] arr = {1, 55, 66, 98};
        for (int o = 0; o < arr.length; o++) {
            System.out.println("el arreglo inicial es  " + arr[o]);
        }
        System.out.println("ELEMINANDO UN ELEMENTO DEL ARRAY");
        arr[0] = 0;
        System.out.println(arr[0]);
        System.out.println("------------------------------------");
        System.out.println("INTERCAMBIANDO LA POS 0 CON 1");
        arr[0] = 1;
        int auxiliar = 0;
        auxiliar = arr[0];
        arr[0] = arr[1];
        arr[1] = auxiliar;
        System.out.println("IMPRIMO ARREGLO ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);

    }
}
