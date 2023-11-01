public class Main {
    public static void main(String[] args) {
        System.out.println("3. Calculate sum of array elements");
        int [][] arr = {{1,3,5,8,12},{4,2,6,2,1},{12,62,82,42,61}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.print(sum);
    }
}