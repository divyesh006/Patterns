public class Main {
    static void pattern(int n){
        for (int row = 1; row <= n; row++){
            int colInRow = 2 * row - 1;
            int spaceInRow =  n - row;
            for (int space = 1; space <= spaceInRow; space++){
                System.out.printf("  ");
            }
            for (int col = 1; col <= colInRow; col++){
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
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *

 */