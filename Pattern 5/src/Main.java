import javax.swing.*;

public class Main {
    static void pattern(int n){
        for (int row = 1; row < 2*n; row++){
            int totalColsInRow;
            if (row > n){
                totalColsInRow = 2*n - row;
            }else {
                totalColsInRow = row;
            }
            for (int col = 1; col <= totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
/*
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 */