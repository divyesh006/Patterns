public class Main {
    static void pattern(int n){
        for (int row = 1; row <= n; row++){
            int spaceInRow = n - row;
            for (int space = 1; space <= spaceInRow; space++){
                System.out.printf("  ");
            }
            for (int col = 1; col <= row; col++){
                //space
                System.out.printf("  * ");
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
              *   *
            *   *   *
          *   *   *   *
        *   *   *   *   *


 */