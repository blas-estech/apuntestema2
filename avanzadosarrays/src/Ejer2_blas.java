/*Crear un programa que determine si dos arrays son iguales. Tanto en números como en tamaño de array. Probarlo con los arrays {1, 2, 3} y {1, 2, 3}; {1, 2, 3, 4} y {1, 2, 3, 4}; {1, 2, 3} y {3, 4, 5}*/

public class Ejer2_blas {
    public static void main(String[] args) {
        /*Parte 1*/
        int array1[] = new int[3];
        int array2[] = new int[3];
        int cont1 = 0;

        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;

        for(int i = 0; i < array1.length; i++){
            if(array1[i] == array2[i]){
                cont1++;
            }
        }
        if(cont1 == array1.length){
            System.out.println("Los arrays 1 y 2 son iguales");
        }else{
            System.out.println("Los arrays 1 y 2 no son iguales");
        }
        /*Parte 2*/
        int array3[] = new int[4];
        int array4[] = new int[4];
        int cont2 = 0;

        array3[0] = 1;
        array3[1] = 2;
        array3[2] = 3;
        array3[3] = 4;

        array4[0] = 1;
        array4[1] = 2;
        array4[2] = 3;
        array4[3] = 4;

        for(int i = 0; i < array3.length; i++){
            if(array3[i] == array4[i]){
                cont2++;
            }
        }
        if(cont2 == array3.length){
            System.out.println("Los arrays 3 y 4 son iguales");
        }else{
            System.out.println("Los arrays 3 y 4 no son iguales");
        }
        /*Parte 3*/
        int array5[] = new int[3];
        int array6[] = new int[3];
        int cont3 = 0;

        array5[0] = 1;
        array5[1] = 2;
        array5[2] = 3;

        array6[0] = 3;
        array6[1] = 4;
        array6[2] = 5;

        for(int i = 0; i < array6.length; i++){
            if(array5[i] == array6[i]){
                cont3++;
            }
        }
        if(cont3 == array6.length){
            System.out.println("Los arrays 5 y 6 son iguales");
        }else{
            System.out.println("Los arrays 5 y 6 no son iguales");
        }
    }
}
