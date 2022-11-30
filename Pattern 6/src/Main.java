public class Main {
    static void pattern(int n){
        for (int row = 1; row <= n; row++){
            int noOfSpace = n - row;
            for (int space = 1; space <= noOfSpace; space++){
                System.out.printf("  ");
            }
            for (int col = 1; col <= row; col++){
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
      * *
    * * *
  * * * *
* * * * *

 */