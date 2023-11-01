import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("7. Bubble Sort");
        int[] arr = new int[]{55,21,69,92,78};
        System.out.println("Base array: " + Arrays.toString(arr));
        boolean isSorted = false;
        int repl;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < arr.length-1;i++){
                if(arr[i] > arr[i+1]){
                    isSorted = false;
                    repl = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = repl;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}