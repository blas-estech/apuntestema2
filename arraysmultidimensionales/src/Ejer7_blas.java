import java.util.Arrays;
import java.util.Scanner;

//Escribe un programa que dada una matriz de 3x3 haga lo siguiente:
//a. Calcule la media de todos los valores
//b. Calcule el valor mínimo y el máximo de todos los valores
//c. Sumar los valores en la diagonal descendente.
//d. Sumar los valores en la diagonal ascendente.
//e. Sumar los valores que están por encima de la diagonal descendente.
//f. Sumar los valores que están por debajo de la diagonal descendente.
//Antes de nada, el programa debe pedir los 9 números de la matriz al usuario. A continuación, mostrar un menú con las 6 operaciones anteriores. Dependiendo de la opción elegida, se muestra el resultado esperado.
//Probarlo con la matriz [[1,2,3], [4,5,6], [7,8,9]]

public class Ejer7_blas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[][] = new int[3][3];
        int n;

        System.out.println("Elige que quieres hacer (escribiendo 1 para la opción a, 2 para b, 3 para c, 4 para d, 5 para e y 6 para f):");
        System.out.println("a. Calcule la media de todos los valores");
        System.out.println("b. Calcule el valor mínimo y el máximo de todos los valores");
        System.out.println("c. Sumar los valores de la diagonal descendente");
        System.out.println("d. Sumar los valores de la diagonal ascendente");
        System.out.println("e. Sumar los valores que están por encima de la diagonal descendente");
        System.out.println("f. Sumar los valores que están por debajo de la diagonal descendente");
        n = sc.nextInt();

        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Introduce 3 números para rellenar el Array" + (i + 1) + "[]");
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }
        System.out.println();

        if(n==1){

            System.out.println("a. Calcule la media de todos los valores");
            System.out.println("{(" + array1[0][0] + "+" + array1[0][1] + "+" + array1[0][2] + ") + (" + array1[1][0] + "+" + array1[1][1] + "+" + array1[1][2] + ") + (" + array1[2][0] + "+" + array1[2][1] + "+" + array1[2][2] + ")} = " + (array1[0][0] + array1[0][1] + array1[0][2] + array1[1][0] + array1[1][1] + array1[1][2] + array1[2][0] + array1[2][1] + array1[2][2]));
            System.out.println("La media de todos los valores es: " + (array1[0][0] + array1[0][1] + array1[0][2] + array1[1][0] + array1[1][1] + array1[1][2] + array1[2][0] + array1[2][1] + array1[2][2]));

        }else if(n==2){
            
            int valormayor = array1[0][0];
            int valormenor = array1[0][0];
            System.out.println("b. Calcule el valor mínimo y el máximo de todos los valores");
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1.length; j++) {
                    if(array1[i][j] > valormayor){
                        valormayor = array1[i][j];
                    }
                    if(array1[i][j] < valormenor){
                        valormenor = array1[i][j];
                    }
                }
            }
            System.out.println("El valor mayor de la matriz es: " + valormayor);
            System.out.println("El valor menor de la matriz es: " + valormenor);

        }else if(n==3){

            System.out.println("c. Sumas los valores en la diagonal descendente");
            System.out.println("{(" + array1[0][0] + "+" + array1[1][1] + "+" + array1[2][2] + ")} = " + (array1[0][0] + array1[1][1] + array1[2][2]));
            System.out.println("La suma de los valores en la diagonal descendente es: " + (array1[0][0] + array1[1][1] + array1[2][2]));

        }else if(n==4){

            System.out.println("d. Sumas los valores en la diagonal ascendente");
            System.out.println("{(" + array1[2][0] + "+" + array1[1][1] + "+" + array1[0][2] + ")} = " + (array1[2][0] + array1[1][1] + array1[0][2]));
            System.out.println("La suma de los valores en la diagonal ascendente es: " + (array1[2][0] + array1[1][1] + array1[0][2]));

        }else if(n==5){

            System.out.println("e. Sumar los valores que están por encima de la diagonal descendente");
            System.out.println("{(" + array1[0][1] + "+" + array1[0][2] + "+" + array1[1][2] + ")} = " + (array1[0][1] + array1[0][2] + array1[1][2]));
            System.out.println("La suma de los valores que están por encima de la diagonal descendente es: " + (array1[0][1] + array1[0][2] + array1[1][2]));

        }else if(n==6){

            System.out.println("f. Sumar los valores que están por debajo de la diagonal descendente");
            System.out.println("{(" + array1[1][0] + "+" + array1[2][0] + "+" + array1[2][1] + ")} = " + (array1[1][0] + array1[2][0] + array1[2][1]));
            System.out.println("La suma de los valores que están por debajo de la diagonal descendente es: " + (array1[1][0] + array1[2][0] + array1[2][1]));

        }
        sc.close();
    }
}
