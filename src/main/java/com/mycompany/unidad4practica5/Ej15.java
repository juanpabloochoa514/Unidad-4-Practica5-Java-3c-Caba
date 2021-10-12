package com.mycompany.unidad4practica5;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realice un programa que lea un arreglo de N elementos enteros y lo rebata,
 * tal que el primer elemento quede en último lugar, el segundo en el penúltimo
 * y así sucesivamente.
 */
public class Ej15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("   INGRESE LA LONGITUD DEL VECTOR   ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int[] arraux = new int[N];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("INGRESE VALORES AL ARRAY");
            arr[i] = scanner.nextInt();
            arraux[i] = arr[i];
        }
        int auxiliar=0;
        for(int Y=arraux.length-1;Y>=0;Y--){//CORRIMIENTO HACIA LA DERECHA.
            System.out.print("  "+arraux[Y]+"  ");
            
        }
        System.out.println(" ---------------------------------------");
      
        for (int coki = 0; coki < arraux.length; coki++) {
            System.out.println("EL ARRAY AUXILIAR ES EL SIGUIENTE " + arraux[coki]);
        }

    }
}
