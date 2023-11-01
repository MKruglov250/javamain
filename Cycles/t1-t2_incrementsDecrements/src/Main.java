import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Doing increments and Decrements");
        System.out.println("1. Print odd numbers in range from 1 to 99");
        for (Integer i = 0; i < 100; i++){
            if (i%2 == 1){
                System.out.println(i);
            }
        }
        // Красивое решение из интернета
        /*IntStream.range(0, 100).forEachOrdered(n -> {
            if (n%2 == 1){
                System.out.println(n);
            }
        });*/
        System.out.println("2. Print numbers from 5 to 1");
        for (Integer i = 5; i >= 0; i--){
            System.out.println(i);
        }
    }
}