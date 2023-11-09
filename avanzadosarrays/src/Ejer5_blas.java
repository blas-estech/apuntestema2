import java.util.Arrays;
import java.util.Scanner;

//Leer 10 números por teclado y almacenarlos en un array. Crear dos arrays, uno para los números pares del primer array y otro para los impares, con el tamaño adecuado. Almacenar los números pares en el array para ello, y lo mismo para los números impares. Si hubiera algún 0, no se incluiría en ninguno de los dos arrays.
//Es decir, el usuario introduce el array {0,1,2,3,4,5,6,7,8,9}. El resultado debe ser un array con {2,4,6,8} y otro con {1,3,5,7,9}. El 0 se desecharía.

public class Ejer5_blas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[] = new int[10];
        int contPares = 0;
        int contImpares = 0;

        System.out.println("Introduzca 10 números");
        for(int i = 0; i < array1.length; i++){
            array1[i] = sc.nextInt();
            if(array1[i] % 2 == 0 && array1[i] != 0){
                contPares++;
            }else if(array1[i] % 2 != 0){
                contImpares++;
            }
        }
        System.out.println(Arrays.toString(array1));

        int arraypares[] = new int[contPares];
        int arrayimpares[] = new int[contImpares];

        for(int i = 0, j = 0; j < arraypares.length; i++){
            if(array1[i] % 2 == 0 && array1[i] != 0){
                arraypares[j] = array1[i];
                j++;
            }
        }
        for(int i = 0, j = 0; j < arrayimpares.length; i++){
            if(array1[i] % 2 != 0){
                arrayimpares[j] = array1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arraypares));
        System.out.println(Arrays.toString(arrayimpares));
        sc.close();
    }
}
