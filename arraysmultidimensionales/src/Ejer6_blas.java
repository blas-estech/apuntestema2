import java.util.Arrays;
import java.util.Scanner;

//Escribir un programa que calcule el determinante de una matriz de 3x3. Pruébelo con la matriz {{1,2,3}, {4,5,6}, {7,8,8}} cuyo determinante es 3.

public class Ejer6_blas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[][] = new int[3][3];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Introduce 3 números para rellenar el Array" + (i + 1) + "[] y sacar el determinante de los tres");
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }
        System.out.println();

        System.out.println("{(" + array1[0][0] + "*" + array1[1][1] + "*" + array1[2][2] + ") / (" + array1[1][0] + "*" + array1[2][1] + "*" + array1[0][2] + ") / (" + array1[2][0] + "*" + array1[0][1] + "*" + array1[1][2] + ")} - {(" + array1[0][2] + "*" + array1[1][1] + "*" + array1[2][0] + ") / (" + array1[1][2] + "*" + array1[2][1] + "*" + array1[0][0] + ") / (" + array1[2][2] + "*" + array1[0][1] + "*" + array1[1][0] + ")}" + " = " + "(" + (array1[0][0] * array1[1][1] * array1[2][2]) + " + " + (array1[1][0] * array1[2][1] * array1[0][2]) + " + " + (array1[2][0] * array1[0][1] * array1[1][2]) + ")" + " - " + "(" + (array1[0][2] * array1[1][1] * array1[2][0]) + " + " + (array1[1][2] * array1[2][1] * array1[0][0]) + " + " + (array1[2][2] * array1[0][1] * array1[1][0]) + ")" + " = " + ((array1[0][0] * array1[1][1] * array1[2][2]) + (array1[1][0] * array1[2][1] * array1[0][2]) + (array1[2][0] * array1[0][1] * array1[1][2])) + " + " + ((array1[0][2] * array1[1][1] * array1[2][0]) + (array1[1][2] * array1[2][1] * array1[0][0]) + (array1[2][2] * array1[0][1] * array1[1][0])) + " = " + (((array1[0][0] * array1[1][1] * array1[2][2]) + (array1[1][0] * array1[2][1] * array1[0][2]) + (array1[2][0] * array1[0][1] * array1[1][2])) - ((array1[0][2] * array1[1][1] * array1[2][0]) + (array1[1][2] * array1[2][1] * array1[0][0]) + (array1[2][2] * array1[0][1] * array1[1][0]))));

        System.out.println();

        System.out.println("El determinante de la matriz es = " + (((array1[0][0] * array1[1][1] * array1[2][2]) + (array1[1][0] * array1[2][1] * array1[0][2]) + (array1[2][0] * array1[0][1] * array1[1][2])) - ((array1[0][2] * array1[1][1] * array1[2][0]) + (array1[1][2] * array1[2][1] * array1[0][0]) + (array1[2][2] * array1[0][1] * array1[1][0]))) + ".");
        sc.close();
    }
}
