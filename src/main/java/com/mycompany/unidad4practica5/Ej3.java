
package com.mycompany.unidad4practica5;
/*
Realice un algoritmo para poblar un arreglo de enteros y si el último elemento del conjunto almacena un valor 
menor a 10 entonces se impriman todos los elementos con valores negativos sino todos los positivos.
Aclaración de terminología.: La frase “poblar” se utiliza como sinónimo de “poner valores”, pues se refiere al
acto de cargar de valores en _algo_, ese _algo_ puede ser, por ejemplo, un arreglo.
*/
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DEL ARRAY ");
        int N=scanner.nextInt();
        
        int[]arr=new int[N];
        for (int i = 0; i < N; i++) {//ACA PUEBLO EL ARRAY
            System.out.println("INGRESE NUMEROS AL ARRAY ENTEROS ");
            arr[i]=scanner.nextInt();
        }
        
        
        for (int j = 0; j < N; j++) {
            if (arr[j] < 10) {

                for (int pepe = 0; pepe < N; pepe++) {
                    arr[pepe] = arr[pepe] * -1;
                    System.out.println("VALORES NEGATIVOS  " + arr[pepe]);
                }
            }

        }
             
                
     
       scanner.close();
    }
}
