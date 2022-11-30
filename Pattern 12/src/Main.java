public class Main {
    static void pattern(int n){
        for (int row = 1; row < 2 * n; row++){
            int colInRow;
            if (row > n){
                colInRow = row - n + 1;
            }else {
                colInRow = n - row + 1;
            }
            int spaceInRow = n - colInRow;
            for (int space = 1; space <= spaceInRow; space++){
                System.out.printf("  ");
            }
            for (int col = 1; col <= colInRow; col++){
                System.out.printf(" *  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}

/*
        *   *   *   *   *
          *   *   *   *
            *   *   *
              *   *
                *
              *   *
            *   *   *
          *   *   *   *
        *   *   *   *   *

 */