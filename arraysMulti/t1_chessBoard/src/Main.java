import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Create chess board with B and W symbols");
        String[][] board = new String[8][8];
        for(int i = 0; i<8; i++){
            for(int j = 0; j < 8; j++){
                if((i+j)%2 != 0){
                    board[i][j] = String.valueOf('B');
                } else {
                    board[i][j] = String.valueOf('W');
                }
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }
}