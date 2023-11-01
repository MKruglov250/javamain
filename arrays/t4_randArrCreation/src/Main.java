import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("4. Create 2 random arrays and add even numbers");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size from 5 to 10");
        int n = input.nextInt();
        boolean check = false;
        while (true){
            if (n < 5 || n > 10){
                System.out.println("Incorrect value: should be from 5 to 10");
                System.out.println("Enter array size from 5 to 10");
                n = input.nextInt();
            } else {
                break;
            }
        }
        Random rd = new Random();
        int[] randArr1 = new int[n];
//        int[] randArr2 = new int[n];
        for (int i = 0; i < n;i++){
            randArr1[i] = rd.ints(0,100).findFirst().getAsInt();
        }
        System.out.println("First array is: " + Arrays.toString(randArr1));
        int odds = 0;
        for (int i = 0; i < n;i++){
            int res = (int) (randArr1[i]%2);
            if (res == 0){
                odds++;
            }
        }
        int[] randArr2 = new int[odds];
        for (int i = 0, k = 0; i < n;i++){
            int res = (int) (randArr1[i]%2);
            if (res == 0) {
                randArr2[k] = randArr1[i];
                k++;
            }
        }
        System.out.println("Second array (only odds from first): " + Arrays.toString(randArr2));

    }
}