import java.util.Arrays;

//Crea un array bidimensional de 6x6 y rellénalo de forma que los elementos que queden al borde sean 1 y el resto sea 0

public class Ejer4_blas {
    public static void main(String[] args) {
        int array1[][] = new int[6][6];

        array1[0][0] = 1;
        array1[0][1] = 1;
        array1[0][2] = 1;
        array1[0][3] = 1;
        array1[0][4] = 1;
        array1[0][5] = 1;

        array1[1][0] = 1;
        array1[1][1] = 0;
        array1[1][2] = 0;
        array1[1][3] = 0;
        array1[1][4] = 0;
        array1[1][5] = 1;

        array1[2][0] = 1;
        array1[2][1] = 0;
        array1[2][2] = 0;
        array1[2][3] = 0;
        array1[2][4] = 0;
        array1[2][5] = 1;

        array1[3][0] = 1;
        array1[3][1] = 0;
        array1[3][2] = 0;
        array1[3][3] = 0;
        array1[3][4] = 0;
        array1[3][5] = 1;

        array1[4][0] = 1;
        array1[4][1] = 0;
        array1[4][2] = 0;
        array1[4][3] = 0;
        array1[4][4] = 0;
        array1[4][5] = 1;

        array1[5][0] = 1;
        array1[5][1] = 1;
        array1[5][2] = 1;
        array1[5][3] = 1;
        array1[5][4] = 1;
        array1[5][5] = 1;

        System.out.println(Arrays.toString(array1[0]));
        System.out.println(Arrays.toString(array1[1]));
        System.out.println(Arrays.toString(array1[2]));
        System.out.println(Arrays.toString(array1[3]));
        System.out.println(Arrays.toString(array1[4]));
        System.out.println(Arrays.toString(array1[5]));
    }
}
