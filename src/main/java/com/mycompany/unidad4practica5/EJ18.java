
package com.mycompany.unidad4practica5;

/**
 Para quienes quieran soñar con arreglos: Realice un algoritmo para desplazar los valores de los elementos de 
 un arreglo de enteros una posición hacia derecha, afectando solamente el segmento que esté a la derecha de 
 una posición arbitrariamente (puede ser ingresada por el usuario por teclado o estar escrita en el código 
“hardcodeada”) poniendo un cero en dicho lugar.
Por ejemplo: Si el arreglo contiene {2, 3, 4, 5, 6} y se desplaza a derecha a partir de la posición 2 entonces 
debe quedar {2, 3, 0, 4, 5}

 */
public class EJ18 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
      
        int auxiliar = 0;
       
            for (int o =2; o < arr.length-o; o++) {
                
                    auxiliar = arr[o];
                    arr[o+1] = arr[o];
                    arr[o + 1] = auxiliar;
                    arr[o]=0;
                   
                }
            for(int i=0;i<arr.length;i++){
                System.out.print("  "+arr[i]+"  ");
            }
            
    }
}
