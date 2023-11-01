public class Main {
    public static void main(String[] args) {
        System.out.println("7. Printing first N Fibonacci numbers");
        int i = 11;
        int a = 2;
        int fib1 = 0;
        int fib2 = 1;
        int fib3 = 0;
        System.out.println(fib1);
        System.out.println(fib2); //Printing first 2 numbers
        while (a<i){
            fib3 = fib1 + fib2;
            System.out.println(fib3);
            fib1 = fib2;
            fib2 = fib3;
            a = a+1;
            }
        }
    }