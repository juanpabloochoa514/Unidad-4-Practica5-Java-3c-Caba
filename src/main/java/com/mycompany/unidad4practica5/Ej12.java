
package com.mycompany.unidad4practica5;
import java.util.Scanner;
/**
 Realice un programa para poblar dos arreglos A y B de N y M elementos respectivamente (N puede ser distinto
 de M). Luego se debe crear otro arreglo C más con capacidad para N+M elementos y almacenar 
 intercaladamente los valores de A y B, poniendo en las posiciones pares los de A y en las impares los de B.
 */
public class Ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL LONG DEL PRIMER VECTOR ");
        int N = scanner.nextInt();
        int[] arrpar = new int[N];
        System.out.println("INGRESE EL LONG DEL SEGUNDO VECTOR ");
        int M=scanner.nextInt();
        int[] arrimpar = new int[M]; 
        int[] arrc= new int[N+M];
        int contpares=0,contimp=arrc.length-1;
        for(int i =0;i<arrc.length-1;i++){//LLENO VECTOR A
            System.out.println("CARGUE VALORES PARA EL PRIMER VECTOR");
            arrpar[i]=scanner.nextInt();
            
            
        }
        for(int a=0;a<arrimpar.length;a++){//LLENO VECTOR B
            System.out.println("CARGUE VALORES PARA EL SEGUNDO VECTOR ");
            arrimpar[a]=scanner.nextInt();
        }
        for(int p=0;p<arrc.length-1;p++){//ACA TRATO DE INTERCALAR PARES CON IMPARES.
            if(arrc[p]%2==0){//valido si es par
               arrc[contpares]=arrpar[p];
               contpares++;//asciendo por derecha
            }else{//valido si es impar
                arrc[contimp]=arrimpar[p];
                contimp--;//desciendo por izquieda
            }
        }
        
        System.out.println("EL ARRAY C ES EL SIGUIENTE :");
        for(int imprimir=0;imprimir<arrc.length;imprimir++){
            System.out.print("   "+arrc[imprimir]+"   ");
            
        }
    }
   
 }
