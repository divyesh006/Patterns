public class Main {
    static void pattern(int n){
        for (int row = 1; row < 2 * n; row++){
            int colInRow;
            if (row > n){
                colInRow = 4 * n - 2 * row;
            }else {
                colInRow = 2 * row;
            }
            int spaceInRow = 2 * n - colInRow;
            for (int col = 1; col <= colInRow / 2; col++){
                System.out.printf("* ");
            }
            for (int space = 1; space <= spaceInRow; space++){
                System.out.printf("  ");
            }
            for (int col = 1; col <= colInRow / 2; col++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}

/*

 *                 *
 * *             * *
 * * *         * * *
 * * * *     * * * *
 * * * * * * * * * *
 * * * *     * * * *
 * * *         * * *
 * *             * *
 *                 *

 */