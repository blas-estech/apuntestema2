import java.util.Scanner;

public class Ejer1_blas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];
        array[0] = 25;
        array[1] = 0;
        array[2] = 0;
        array[3] = 50;
        array[4] = 0;
        array[5] = 0;
        array[8] = 75;
        array[9] = 100;
        System.out.println("El valor de la posición 1 es " + array[0]);
        System.out.println("El valor de la posición 4 es " + array[3]);
        System.out.println("El valor de la posición 9 es " + array[8]);
        System.out.println("El valor de la posición 10 es " + array[9]);

        System.out.println();

        System.out.println("Los valores de todos los arrays son " + array[0] + ", " + array[3] + ", " + array[8] + ", " + array[9] + ".");

        System.out.println();

        System.out.println("El valor de la posición 1 es " + array[0]);
        System.out.println("El valor de la posición 2 es " + array[1]);
        System.out.println("El valor de la posición 3 es " + array[2]);
        System.out.println("El valor de la posición 4 es " + array[3]);
        System.out.println("El valor de la posición 5 es " + array[4]);
        System.out.println("El valor de la posición 6 es " + array[5]);

        System.out.println();

        for(int i = 0; i < array.length - 4; i++){
            System.out.println("El valor de la posicion " + i + " es " + array[i]);
        }
        scanner.close();
    }
}
