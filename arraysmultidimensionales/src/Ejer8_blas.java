import java.util.Arrays;
import java.util.Scanner;

//Crear un array bidimensional de 3x6 con los números que desees. Crea otro array de 6x3 y traspón el primero en el segundo.
//Es decir, si tenemos este de 2x3      {1, 3, 5}         debería quedar {1, 2}
//                                      {2, 4, 6}                        {3, 4}
//                                                                       {5, 6}

public class Ejer8_blas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[][] = new int[3][6];
        int array2[][] = new int[6][3];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Intoduzca 6 valores pra completar el Array" + (i + 1) + "[]");
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(Arrays.toString(array1[i]));
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
            System.out.println(Arrays.toString(array2[i]));
        }
        sc.close();
    }
}
