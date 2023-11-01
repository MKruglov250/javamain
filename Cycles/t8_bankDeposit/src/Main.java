import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("8. Calculating percents for bank deposit");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sum of bank deposit");
        float deposit = input.nextFloat();
        System.out.println("Enter number of months");
        int months = input.nextInt();
        float percentage = 0.07F;
        for (int i = 0; i<months; i++){
            deposit = deposit * (1+percentage);
        }
        System.out.println("Final sum is: " + deposit);
    }
}