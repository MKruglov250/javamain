import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[]{1,2,5,5,7,8,10,5,3,2,8,11};
        System.out.println("1. Delete a number from array");
        System.out.println("Base array is: " + Arrays.toString(testArray));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to delete from array");
        int n = input.nextInt();
        int numCount = 0;
        for (int i : testArray){
            if (n == i){
                numCount++;
        }
    }
        int[] newArray = new int[testArray.length-numCount];
        System.out.println("Number of deleted elements: " + numCount);
        for (int k = 0, j = 0; k < testArray.length; k++){
            if (testArray[k]!=n){
                newArray[j] = testArray[k];
                j++;
            }
        }
        System.out.println("New array is: " + Arrays.toString(newArray));
}}