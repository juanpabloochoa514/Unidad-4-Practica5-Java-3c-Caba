package com.mycompany.unidad4practica5;
import java.util.Scanner;

/**
Realice un algoritmo para construir un arreglo a partir de otro especificando además un tamaño para el nuevo 
arreglo a construir. Si el tamaño es menor al tamaño del arreglo original, entonces se copiaran los elementos
(de izquierda a derecha) que haya hasta donde se pueda (Se trunca). Si el tamaño es igual se copia tal cual es 
(Se clona). Si el tamaño es mayor, se copian todos los elementos y luego se rellenan con 0 (Se expande).

 */
public class Ej14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ESPECIFIQUE TAMAÑO DEL ARRAY 1 ");
        int N = scanner.nextInt();
        int[] arr1 = new int[N];
        for (int pepe = 0; pepe < arr1.length; pepe++) {
            System.out.println("agregue valores al array");
            arr1[pepe] = scanner.nextInt();
        }
        System.out.println("   ");

        System.out.println("CONSTRUYA UN VECTOR  2 ");
        int O = scanner.nextInt();
        int[] arr2 = new int[O];
        //CONDICION 1
        for (int i = 0; i < arr2.length; i++) {//SI EL ARRAY 1 ES MAYOR AL ARRAY 
            if (arr2.length < arr1.length) {
                arr2[i] = arr1[i];
                System.out.println("array 2 = " + arr2[i]);
            }
        }
        //CONDICION 2
        System.out.println("            ");
        for (int I = 0; I < arr2.length; I++) {
            if (arr2.length == arr1.length) {//SI SON IGUALES
                arr2[I] = arr1[I];
                System.out.print(" ARRAYS = " + arr2[I] + "  ");
            }

        }   
        
        //CONDICION 3
        for (int o = 0; o < arr2.length - 1; o++) {

            if (arr2.length > arr1.length) {//SI EL ARRAY 2 ES MAYOR A 1
                arr2[o] = arr1[o];

            }

        }
        for (int fatiga = 0; fatiga < arr2.length; fatiga++) {
            System.out.print(" " + arr2[fatiga] + "  ");
        }
    }
        
    
}
