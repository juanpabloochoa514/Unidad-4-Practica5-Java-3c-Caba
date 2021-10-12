package com.mycompany.unidad4practica5;
import java.util.Scanner;
/**
Se deben pedir por pantalla 10 números y se irán guardando en un array, el resultado de la división de cada par 
de números ingresados. (Ejemplo: se ingresa 20 y luego 5, se almacena en la primera posición el número 4). 
Calcular el cuadrado de cada uno de los números del array, guardando los resultados en otro array. Utilizar las 
técnicas de debugging en las porciones de código que crea conveniente para analizar la ejecución.
 */
public class Ej11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float[] arr=new float[10];
        float[] arr1=new float[10];
        int num1,num2;
        float par=0;
        for(int i = 0 ;i<10 ;i++){
            System.out.println("INGRESE VALOR ENTERO ");
            num1=scanner.nextInt();
            System.out.println("INGRESE VALOR ENTERO");
            num2=scanner.nextInt();
            if(num1%num2==0){
                par=num1/num2;
                arr[i]=par;
            }
        }
        float cuadrado=0;
        for(int o = 0;o<10;o++){
            cuadrado=(float) Math.pow(arr[o],2);
            System.out.println("el cuadrado del numero par es  "+cuadrado);
        }
    }
}
    
        