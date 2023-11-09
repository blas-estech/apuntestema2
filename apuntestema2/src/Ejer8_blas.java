import java.util.Scanner;

public class Ejer8_blas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tamanio = scanner.nextInt();
        int array[] = new int[tamanio];

        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }

        for(int i = 1; i<array.length - 1; i++){
            System.out.println(array[i] + ", ");
        }
        System.out.println(" ");
        System.out.print(array[0] + ", ");
        System.out.print(array[array.length - 1] + ", ");

        scanner.close();
    }
}
