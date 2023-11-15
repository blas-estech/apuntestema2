import java.util.Scanner;

/*Crea un programa que sume todos los elementos de un array de enteros. El programa tiene que valer para un array de cualquier tamaño. Por ejemplo, tiene que funcionar con el array {1, 2, 3, 4, 5} y también si el array lo cambiamos a {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} */

public class Ejer1_blas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[] = new int [10];
        int suma = 0;

        System.out.println("Dime 10 números cialquiera");
        for(int i = 0; i < array1.length; i++){
            array1[i] = sc.nextInt();
        }

        for(int i = 0; i < array1.length; i++){
            suma = suma + array1[i];
        }
        System.out.println("La suma de los 10 números introducidos es igual a: " + suma);
        System.out.printf("La suma de los 10 números introducidos es igual a %d.", suma);
        System.out.println();
        sc.close();
    }
}
