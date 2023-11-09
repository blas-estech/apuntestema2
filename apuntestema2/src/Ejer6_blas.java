import java.util.Scanner;

public class Ejer6_blas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];

        for(int i = 0; i<10; i++){
            array[i] = scanner.nextInt();
        }
        
        int c = 9;
        for(int i = 0; i<10 / 2; i++){
            System.out.print(array[i] + ", ");
            System.out.print(array[c] + ", ");
            c++;
        }
        scanner.close();
    }
}
