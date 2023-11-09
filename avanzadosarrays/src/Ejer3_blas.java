import java.util.Arrays;
import java.util.Scanner;

/*Crea dos arrays (A y B) de tamaño 5 y rellénalo con números introducidos por el usuario. Después crea un tercero con el doble de tamaño cuyos valores serán: el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc.*/

public class Ejer3_blas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[10];

        System.out.println("Introduzca 5 números cualquiera para rellenar el Array1[]");
        for(int i = 0; i < array1.length; i++){
            array1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array1));

        System.out.println("Introduzca 5 números cualquiera para rellenar el Array2[]");
        for(int i = 0; i < array2.length; i++){
            array2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array2));

        System.out.println("Array3");
        array3[0] = array1[0];
        array3[1] = array2[0];
        array3[2] = array1[1];
        array3[3] = array2[1];
        array3[4] = array1[2];
        array3[5] = array2[2];
        array3[6] = array1[3];
        array3[7] = array2[3];
        array3[8] = array1[4];
        array3[9] = array2[4];
        System.out.println(Arrays.toString(array3));
        sc.close();
    }
}
