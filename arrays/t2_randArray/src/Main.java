import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("2. Creating array from random values");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of values for an array");
        int n = input.nextInt();
        double[] randArr = new double[n];
        for (int i = 0; i < randArr.length;i++){
            randArr[i] = Math.random();
        }
        System.out.println("Min value: " + Arrays.stream(randArr).min().getAsDouble());
        System.out.println("Max value: " + Arrays.stream(randArr).max().getAsDouble());
        System.out.println("Average value: " + Arrays.stream(randArr).average().getAsDouble());
    }
}