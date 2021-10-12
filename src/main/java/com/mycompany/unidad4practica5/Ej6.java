
package com.mycompany.unidad4practica5;
import java.util.Scanner;
/**
 Realice un programa en el cual el usuario ingrese una serie de valores entero por teclado y se guarden en un
 arreglo. Para dicha serie se pide calcular y mostrar por pantalla su suma y, luego, su multiplicación. ¿Se le
 ocurre alguna forma de hacerlo sin tener que usar arreglos? ¿Qué ventajas y desventajas observa al respecto?
 */
public class Ej6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("INGRESE EL VALOR DEL TAMAÑO DEL ARRAY");
        int N=scanner.nextInt();
        int SUMA=0,MULTIPLICACION=1;
        int[] arr=new int[N];
        for(int i = 0;i<arr.length;i++){
            System.out.println("INGRESE VALORES ENTEROS!!!! ");
            arr[i]=scanner.nextInt();
            SUMA+=arr[i];
            MULTIPLICACION*=arr[i];
        }
        System.out.println("SUMA  "+SUMA);
        System.out.println("MULTIPLICACION  "+MULTIPLICACION);
    }
}
