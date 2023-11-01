import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature (odd or even number): ");
        Double temperature = input.nextDouble();
        System.out.println("1. Check if number is odd or even");
        boolean checkTemp = OddevenTemp.checkOddeven(temperature);
        if (checkTemp){
            System.out.println("Entered number is odd");
        } else {
            System.out.println("Entered number is even");
        }
        System.out.println("2. Check if it is cold or warm");
        OddevenTemp.checkWarmCold(temperature);
    }
}

class OddevenTemp{
    static boolean checkOddeven(Double t){
        t = Math.abs(t);
        int res = (int) (t%2);
        return res == 1;
    }
    static void checkWarmCold(Double t){
        if (t > -5){
            System.out.println("Temperature is: " + t + ", it is warm");
        } else if (t <= -5 && t > -20){
            System.out.println("Temperature is: " + t + ", it is normal");
        } else {
            System.out.println("Temperature is: " + t + ", it is freaking cold");
        }
    }
}