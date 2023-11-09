import java.util.Arrays;
import java.util.Scanner;

//Crear una matriz de enteros de 2x3 con los valores que tú quieras e imprimirla.

public class Ejer1_blas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraymultidimensional[][] = new int[2][3];
        arraymultidimensional[0][0] = 1;
        arraymultidimensional[0][1] = 2;
        arraymultidimensional[0][2] = 3;

        arraymultidimensional[1][0] = 4;
        arraymultidimensional[1][1] = 5;
        arraymultidimensional[1][2] = 6;

        for (int i = 0; i < arraymultidimensional.length; i++) {
            System.out.println(Arrays.toString(arraymultidimensional[i]));
        }
        sc.close();
    }
}
