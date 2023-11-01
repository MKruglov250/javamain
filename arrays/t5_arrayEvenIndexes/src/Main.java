import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("5. Replace array elements with odd indexes to 0");
        int[] myArr = new int[] {1,2,3,4,5,6,7,8,9};
        System.out.println("Base array is: " + Arrays.toString(myArr));
        int lenght = myArr.length;
        for (int i = 0; i < lenght; i++){
            if ((i%2) != 0){
                myArr[i] = 0;
            }
        }
        System.out.println("New array is: " + Arrays.toString(myArr));
    }
}