//Crear un array bidimensional de 6x6 y complétalo con los números que tú quieras. Muestra la suma de cada una de las filas.

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5_blas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[][] = new int[6][6];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Introduce 6 números con los que quieras rellenar el Array" + (i + 1) + ("[]"));
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]) + " = " + ((array1[i][0]) + (array1[i][1]) + (array1[i][2]) + (array1[i][3]) + (array1[i][4]) + (array1[i][5])));
        }
        System.out.println();
        sc.close();
    }
}
