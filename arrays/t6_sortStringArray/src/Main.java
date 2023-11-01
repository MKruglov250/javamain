import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("6. Sorting array of strings");
        String[] namesArr = new String[]{"Mary","Jane","Peter","Walter","Abraham"};
        Arrays.sort(namesArr);
        System.out.println("Array sorted ascending: " + Arrays.toString(namesArr));
        Arrays.sort(namesArr, Collections.reverseOrder());
        System.out.println("Array sorted descending: " + Arrays.toString(namesArr));
    }
}