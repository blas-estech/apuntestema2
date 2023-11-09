import java.util.Scanner;

public class Ejer2_blas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[20];
        int n = 0;
        int x = 1;
        int a = 1;
        int b = 2;
        int f = 10;
        int y = 11;
        do{
            array[n] = x;
            System.out.println("Posición " + n + " = " + array[n]);
            n++;
            x++;
        }while(n<20);

        System.out.println();

        do{
            array[a] = b;
            System.out.println("Posición " + a + " = " + array[a]);
            a++;
            b++;
        }while(a<9);
        do{
            array[f] = y;
            System.out.println("Posición " + f + " = " + array[f]);
            f++;
            y++;
        }while(f>10 && f<19);
        scanner.close();
    }
}
