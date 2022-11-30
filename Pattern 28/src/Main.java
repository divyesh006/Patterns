public class Main {
    static void pattern(int n){
        for (int row = 1; row < 2 * n; row++){
            int totalColInRow;
            if (row > n){
                totalColInRow = 2 * n - row;
            }else{
                totalColInRow = row;
            }
            int noOfSpace = n - totalColInRow;
            for (int space = 1; space <= noOfSpace; space++){
                System.out.printf(" ");
            }
            for (int col = 1; col <= totalColInRow; col++){
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
     * * * *
      * * *
       * *
        *

 */