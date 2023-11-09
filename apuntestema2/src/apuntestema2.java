public class apuntestema2 {
    public static void main(String[] args) {
        int[]array = {1,2,3,4,5};
        int array2 [] = new int[array.length];

        int c = 4;
        for(int i = 0; i < array.length; i++){
            array2[i] = array[c];
            c--;
        }

        for(int i = 0; i < array2.length; i++){
            array2[i] = array[c];
            c--;
        }

        array2[0] = array[4];
        array2[1] = array[3];
        array2[2] = array[2];
        array2[3] = array[1];
        array2[4] = array[0];
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
    }
}
