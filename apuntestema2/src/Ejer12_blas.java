import java.util.Random;
import java.util.Scanner;

public class Ejer12_blas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int array1[] = new int[10];

        int tam = 0;
        int[] pares = new int[tam];
        for(int i = 0; i<array1.length; i++){
            array1[i] = rnd.nextInt(45);
            System.out.println(array1[i] + ", ");

            if(array1[i] % 2 == 0){
                int c = 0;
                pares[c] = array1[i];
                tam++;
            }
        }

        int[] paress = new int[tam];
        int c = 0;
        for(int i = 0; i<array1.length; i++){
            array1[i] = rnd.nextInt(45);
            System.out.println(array1[i] + ", ");

            if(array1[i] % 2 == 0){
                paress[c] = array1[i];
                c++;
            }
        }
        for(int i = 0; i<array1.length; i++){
            System.out.println(paress[i] + ", ");
        }
        scanner.close();
    }
}
