import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Time of year by month number, if else");
        System.out.println("Enter month number");
        int month = input.nextInt();
        if (month == 12 || month <= 2) {
            System.out.println("Winter");
        } else if (month >= 3 && month < 6) {
            System.out.println("Spring");
        } else if (month >= 6 && month < 9) {
            System.out.println("Summer");
        } else if (month >= 9 && month <12) {
            System.out.println("Autumn");
        } else {
            System.out.println("Invalid month number");
        }
    }
}