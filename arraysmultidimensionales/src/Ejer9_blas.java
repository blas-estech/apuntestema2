import java.util.Arrays;
import java.util.Scanner;

//Crear un array de dos dimensiones que simule una columna de una quiniela. La columna de una quiniela es un listado de partidos con 3 casillas cada uno, donde se marca victoria, empate o derrota poniendo una X en una de las casillas.
//Una vez creada la quiniela, crea un menú donde el usuario podrá elegir cómo quiere rellenarla
//a. Opción 1: El usuario nos dice el resultado que quiere para cada partido
//b. Opción 2: Rellenar todas las casillas de forma aleatoria
//c. Opción 3: El usuario nos dice algunos resultados y el resto se generan aleatorios.

public class Ejer9_blas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[][] = new int[14][3];

        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }





















        sc.close();
    }
}
