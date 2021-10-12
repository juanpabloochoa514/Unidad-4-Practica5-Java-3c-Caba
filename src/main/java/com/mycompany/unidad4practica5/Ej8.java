
package com.mycompany.unidad4practica5;
import java.util.Scanner;
/**
Realice un algoritmo para determinar si el valor “1” se encuentra dentro arreglo de elementos del tipo int
 */
public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DEL ARRAY ");
        int N=scanner.nextInt();
        int[] arr = new int[N];
        for(int o =0;o<arr.length;o++){
            System.out.println("INGRESE EL VALOR ENTERO");
            arr[o]=scanner.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==1){
                System.out.println("SE ENCONTRO EL 1 EN LA POSICION"+i);//PREGUTNAR POR LOS CORRIMIENTOS . NO DA BIEN LA POSICION.
            }
        }
        
    }
    
}
