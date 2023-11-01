public class Main {
    public static void main(String[] args) {
        System.out.println("4. Printing sequence 7, 14...98");
        int i = 7;
        while (i < 99){
            System.out.println(i);
            i += 7;
        }
        System.out.println("5. Printing first 10 numbers of sequence 0, -5, -10... ");
        int a = 0;
        int b = 0;
        while (a < 10){
            System.out.println(b);
            a += 1;
            b -= 5;
        }
        System.out.println("6. Printing squares of numbers from 10 to 20 ");
        double c = 10;
        double d = 0;
        while (c < 21){
            d = Math.pow(c,2.0);
            System.out.println(d);
            c += 1;
        }
    }
}