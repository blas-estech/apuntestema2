import java.util.Scanner;

public class Ejer11_blas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];

        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }

        int veces = 0;
        System.out.println("Dame un número para buscar");
        int numero = scanner.nextInt();
        for(int i = 0; i<array.length; i++){
            if(array[i]==numero){
                System.out.println("Lo he encontrado, está en la posición " + (i + 1));
            } 
        }
        if(veces == 0){
            System.out.println("No lo he encontrado");
        }
        scanner.close();
    }
}
