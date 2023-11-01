import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[]{1,2,3,5,7,11,13,17,19};
        System.out.println("0. Enter a number to check if it is in array");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = input.nextInt();
        boolean t = false;
        for (int i : testArray){
            if (n == i){
                System.out.println("Element is present in a given array");
                t = true;
                break;
            }
        }
        if (t == false){
            System.out.println("Element is not present in a given array");
        }
    }
}