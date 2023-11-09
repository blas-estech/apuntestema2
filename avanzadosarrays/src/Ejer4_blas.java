import java.util.Scanner;

//Programa para leer la altura en metros de N personas y calcular la altura media:
//a. Primero se pedirá el número de personas por teclado y el tamaño del array será ese.
//b. Después, se llenará el array con la altura de las personas leída también por teclado. La altura será en metros
//c. A continuación, calculamos la altura media.
//d. Después, diremos cuántas personas tienen una altura superior a la media y cuántas están por debajo de la media.

public class Ejer4_blas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de personas que hay para leer la altura en metros y hacer la media");
        int num = sc.nextInt();
        double array1[] = new double[num];
        double media;
        int continferior = 0;
        int contsuperior = 0;
        int contiguales = 0;

        System.out.println("Introduzca las medidas de las personas");
        for(int i = 0; i < array1.length; i++){
            array1[i] = sc.nextDouble();
        }
        double sumatoria = 0;
        for (int i = 0; i < array1.length; i++) {
            sumatoria = sumatoria + array1[i];

        }
        media = sumatoria / num;

        System.out.println("La suma de las medidas de las personas es de: " + sumatoria);
        System.out.println("La media de la suma de las medidas de las personas es de: " + media);
        
        for(int i = 0; i < array1.length; i++){
            if(array1[i]<media){
                continferior++;
            }else if(array1[i]>media){
                contsuperior++;
            } else if(array1[i]==media){
                contiguales++;
            }
        }
        System.out.println("Por encima de la media hay " + contsuperior + " personas");
        System.out.println("Por debajo de la media hay " + continferior + " personas");
        System.out.println("Iguales que la media hay " + contiguales + " personas");
        sc.close();
    }
}
