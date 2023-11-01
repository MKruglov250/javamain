import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("0. Create three-dimensional array");
        int[][][] arr = new int[1][2][3];
        Random rd = new Random();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++){
                for (int k = 0; k < 3; k++){
                    arr[i][j][k] = rd.ints(0,10).findFirst().getAsInt();
                }
            }
        }
        System.out.println("Base array: " + Arrays.deepToString(arr));
        System.out.println("Enter number to increase array elements: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++){
                for (int k = 0; k < 3; k++){
                    arr[i][j][k] += n;
                }
            }
        }
        System.out.println("Changed array: " + Arrays.deepToString(arr));
    }

}