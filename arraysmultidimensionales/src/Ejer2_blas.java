//import java.util.Arrays;
import java.util.Scanner;

//Se necesita un programa para calcular la nota de alumnos calculando la media de las 3 notas que tienen en cada trimestre. Tenemos 4 alumnos en clase, por lo que se pide:
//a. Crear un array bidimensional tipo double de 4x3, donde las filas serán los alumnos y las columnas serán los trimestres
//b. Pedir las 3 notas de cada uno de los alumnos y guardarlas en el array.
//c. Crear un array de 4 elementos donde se almacenará la media de cada alumno.

public class Ejer2_blas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arraynotas [][] = new double[4][3];

        for (int i = 0; i < arraynotas.length; i++) {
            System.out.println("Introduce las notas del " + (i + 1) + ("º alumno"));
            for (int j = 0; j < arraynotas[i].length; j++) {
                arraynotas[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < arraynotas.length; i++) {
            for (int j = 0; j < arraynotas[i].length; j++) {
                System.out.print(arraynotas[i][j]+",");
            }
            System.out.println();
        }

        //for (int i = 0; i < arraynotas.length; i++) {
            //System.out.println(Arrays.toString(arraynotas[i]));
        //}

        System.out.println();

        System.out.println("La suma de las notas del 1º alumno es: " + (arraynotas[0][0] + arraynotas[0][1] + arraynotas[0][2]));
        System.out.println("La suma de las notas del 2º alumno es: " + (arraynotas[1][0] + arraynotas[1][1] + arraynotas[1][2]));
        System.out.println("La suma de las notas del 3º alumno es: " + (arraynotas[2][0] + arraynotas[2][1] + arraynotas[2][2]));
        System.out.println("La suma de las notas del 4º alumno es: " + (arraynotas[3][0] + arraynotas[3][1] + arraynotas[3][2]));

        System.out.println();

        System.out.println("La media del 1º alumno es: " + (arraynotas[0][0] + arraynotas[0][1] + arraynotas[0][2]) / (2));
        System.out.println("La media del 2º alumno es: " + (arraynotas[1][0] + arraynotas[1][1] + arraynotas[1][2]) / (2));
        System.out.println("La media del 3º alumno es: " + (arraynotas[2][0] + arraynotas[2][1] + arraynotas[2][2]) / (2));
        System.out.println("La media del 4º alumno es: " + (arraynotas[3][0] + arraynotas[3][1] + arraynotas[3][2]) / (2));
        sc.close();
    }
}
