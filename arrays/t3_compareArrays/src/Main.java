import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] testArr1 = new int[]{3,5,8,10,11};
        int[] testArr2 = new int[]{5,7,1,6,18};
        System.out.println("3. Create and compare 2 arrays of 5 elems");
        System.out.println("Array #1: " + Arrays.toString(testArr1));
        System.out.println("Array #2: " + Arrays.toString(testArr2));
        double av1 = 0;
        double av2 = 0;
        av1 = Arrays.stream(testArr1).average().getAsDouble();
        av2 = Arrays.stream(testArr2).average().getAsDouble();
        if (av1 > av2){
            System.out.println("Average of Array 1 > Average of Array 2: " + av1 + ">" + av2);
        } else if (av2 > av1){
            System.out.println("Average of Array 2 > Average of Array 1: "  + av2 + ">" + av1);
        } else if (av2 == av1){
            System.out.println("Average of Arrays are equal: " + av2 + "=" + av1);
        }
    }
}