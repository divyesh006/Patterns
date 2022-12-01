public class Main {
    static void pattern(int n){
        for (int row = 1; row < 2 * n; row++){
            int spaceInRow;
            if (row > n){
               spaceInRow = row - n;
            }else {
                spaceInRow = n -row;
            }
            int colInRow;
            if (row > n){
                colInRow = 4 * n - 2 * row - 1;
            }else {
                colInRow = 2 * row - 1;
            }
            for (int space = 1; space <= spaceInRow; space++){
                System.out.printf(" ");
            }
            for (int col = 1; col <= colInRow; col++){
                if (col == 1 || col == colInRow){
                    System.out.printf("*");
                }else {
                    System.out.printf(" ");
                }
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
               *   *
              *     *
             *       *
              *     *
               *   *
                * *
                 *

 */