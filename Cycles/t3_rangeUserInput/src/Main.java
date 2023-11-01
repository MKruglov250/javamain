import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("3. Print numbers from 1 to user inputted number");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number greater than 1");
        int n = input.nextInt();
        for (Integer i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}