public class Main {
    public static void main(String[] args) {
        System.out.println("2. Matrix Multiplication");
        int [][] arr1 = {{1,0,0},{0,1,0},{0,0,0}};
        int [][] arr2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int [][] arr3 = new int [3][3];
        for (int i=0; i<3;i++){
            for (int j=0; j<3;j++){
                for (int k=0; k<3;k++){
                    arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}