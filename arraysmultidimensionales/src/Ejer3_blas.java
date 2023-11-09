//Crear un array bidimensional de tamaño 7x7 y rellenarlo de forma que los elementos de la  diagonal principal sean 1 y el resto 0. Imprimir el resultado.

import java.util.Arrays;

public class Ejer3_blas {
    public static void main(String[] args) {
    int array1[][] = new int[7][7];

    for (int i = 0; i < array1.length; i++) {
        for (int j = 0; j < array1[i].length; j++) {
            if(i == j){
                array1[i][j] = 1;
            }else{
                array1[i][j] = 0;
            }
        }
    }
    for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
    }
    }
}
