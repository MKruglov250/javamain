import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("0. Time of year by month number");
        System.out.println("Enter month number");
        int month = input.nextInt();
        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
        }
    }
