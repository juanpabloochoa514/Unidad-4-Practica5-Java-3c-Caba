
package com.mycompany.unidad4practica5;

/*
Idem 12, pero desplazando a la izquierda el segmento izquierdo de una posición arbitraria.
Por ejemplo: Si el arreglo contiene {2, 3, 4, 5, 6} y se desplaza a izquierda a partir de la posición 2 entonces
debe quedar {3, 4, 0, 5, 6}
 */
public class Ej19 { 
    public static void main(String[] args) {
        int[] arr={2, 3, 4, 5, 6};
        int auxiliar=0;
        for(int i=0;i<arr.length-i;i+=1){
            auxiliar=arr[i+1];
            arr[i]=arr[i+1];
            arr[i+1]=auxiliar;
            
        }
        int p = 1;
        arr[p+1]=0;
        for(int o=0;o<arr.length;o++){
            System.out.print("  "+arr[o]+"  ");
        }
    }
    
}
