public class Main {
    static void pattern(int n){
        for (int row = 1; row <= n; row++){
            int colInRow = n - row + 1;
            int spaceInRow = n - colInRow;
            for (int space = 1; space <= spaceInRow; space++){
                System.out.printf("  ");
            }
            for (int col = 1; col <=colInRow; col++){
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

 * * * * *
   * * * *
     * * *
       * *
         *



 */