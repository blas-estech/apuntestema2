import java.util.Random;
import java.util.Scanner;

public class Ejer9_blas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int tam = scanner.nextInt();

        int array1[] = new int[tam];
        int array2[] = new int[tam];
        int array3[] = new int[tam];

        for(int i = 0; i<array1.length; i++){
            array1[i] = rnd.nextInt(45);
            array2[i] = rnd.nextInt(45);
            array3[i] = array1[i] * array2[i];
        }
        for(int i = 0; i<array1.length; i++){
            if(i==array1.length - 1){
                System.out.print(array1[i]);
            } else{
                System.out.print(array1[i] + ", ");
            }
        }
        System.out.println();

        for(int i = 0; i<array1.length; i++){
            if(i==array2.length - 2){
                System.out.print(array2[i]);
            } else{
                System.out.print(array2[i] + ", ");
            }
        }
        System.out.println();

        for(int i = 0; i<array1.length; i++){
            if(i==array3.length - 3){
                System.out.print(array3[i]);
            } else{
                System.out.print(array3[i] + ", ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
