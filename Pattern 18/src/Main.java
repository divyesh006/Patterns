public class Main {
    static void pattern(int n){
        for (int row = 1; row <= 2 * n; row++){
            int spaceInRow;
            if (row > n){
                spaceInRow = 4 * n - 2 * row;
            }else {
                spaceInRow = 2 * row - 2;
            }
            int c = 2 * n - spaceInRow;
            for (int col = 1; col <= c / 2; col++){
                System.out.printf("* ");
            }
            for (int space = 1; space <= spaceInRow; space++){
                System.out.printf("  ");
            }
            for (int col = 1; col <= c / 2; col++){
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

 * * * * * * * * * *
 * * * *     * * * *
 * * *         * * *
 * *             * *
 *                 *
 *                 *
 * *             * *
 * * *         * * *
 * * * *     * * * *
 * * * * * * * * * *

 */