/*
Realice un algoritmo para cargar por teclado los elementos de un arreglo de enteros y escriba por pantalla los 
valores de dicho arreglo sin repetir.
Por ejemplo: Si el arreglo ingresado es {2, 5, 3, 4, 5, 0, 5, 40,4} debe imprimir 3, 4, 5, 0 y 40. No importa el
orden en que se impriman los valores pero sí importa que no haya resultados repetidos.
Invoco a mi buda programador interior, pienso y luego codifico: ¿Qué pasa si el usuario ingresa valores en el
arreglo de forma creciente y ordenada? ¿Se podría codificar el algoritmo de forma más sencilla?.
 */
package com.mycompany.unidad4practica5;

import java.util.Scanner;
public class Ej21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("INGRESE LA LONGITUD DEL VECTOR");
        int N=scanner.nextInt();
        int[] arr=new int [N];
        int repetir=0;
        for(int ingresavalor=0;ingresavalor<arr.length;ingresavalor++){
            System.out.println("INGRESE UN VALOR AL ARRAY");
            arr[ingresavalor]=scanner.nextInt();
        }
        System.out.println("RESULTADO");
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                System.out.print("  " + arr[i+1] + "  ");
            }

        }
    }
}

