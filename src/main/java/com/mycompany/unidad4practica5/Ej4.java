
package com.mycompany.unidad4practica5;
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
    //Realice un algoritmo para poblar a un arreglo de números reales. Si la suma de los valores almacenados en
    //sus elementos resulta mayor que cero imprimir las de índice par sino las de índice impar.

        Scanner scanner=new Scanner (System.in);
        
        System.out.println("INGRESE EL TAMAÑO DEL ARRAY");
        int N = scanner.nextInt();
        double[] arr=new double [N];
        double suma=0;
        for(int i = 0 ;i<arr.length;i++){
            System.out.println("INGRESE NUMEROS REALES");
            arr[i]=scanner.nextDouble();
            suma+=arr[i];
        }
        System.out.println("SUMA "+suma);
        for(int o=0;o<arr.length;o++){
            if(suma>0){
                if(arr[o]%2==0){
                    System.out.println("El NUMERO DEL ARRAY PAR  "+arr[o]);
                }
                else{
                    System.out.println("NUMERO IMPARES  "+arr[o]);
                }
            }
        }
        scanner.close();
    }   
}
