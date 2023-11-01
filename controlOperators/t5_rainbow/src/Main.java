import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Defining the color of a rainbow");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rainbow number - from 1 to 7");
        int rainbowColor = input.nextInt();
        switch(rainbowColor){
            case 1:
                System.out.println("Color is red");
                break;
            case 2:
                System.out.println("Color is orange");
                break;
            case 3:
                System.out.println("Color is yellow");
                break;
            case 4:
                System.out.println("Color is green");
                break;
            case 5:
                System.out.println("Color is light blue");
                break;
            case 6:
                System.out.println("Color is blue");
                break;
            case 7:
                System.out.println("Color is purple");
                break;
            default:
                System.out.println("Incorrect number");
                break;
        }
    }
}