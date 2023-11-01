public class Main {
    public static void main(String[] args) {
        System.out.println("4. Print array diagonals");
        int [][] arr = {{1,3,5},{4,2,6},{12,62,82}};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i == j) System.out.println(arr[i][j]);
            }
        }
    }
}