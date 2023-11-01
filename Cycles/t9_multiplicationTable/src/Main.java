public class Main {
    public static void main(String[] args) {
        System.out.println("9. Printing out multiplication table");
        int a = 9;
        for (int i = 1; i <= a; i++){
            for (int b = 1; b <= a; b++){
                int c = b * i;
                System.out.println(i + " x " + b + " = " + c);
            }
        }
    }
}