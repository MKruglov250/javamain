import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("5. Sorting array elements by string");
        int [][] arr = {{2,1,10,8,12},{4,2,6,7,1},{12,62,82,42,61}};
        System.out.println("Unsorted array: " + Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++){
            Arrays.sort(arr[i]);
        }
        System.out.println("Sorted array: " + Arrays.deepToString(arr));
    }
}