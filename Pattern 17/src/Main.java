public class Main {
    static void pattern(int n){
        for (int row = 1; row < 2 * n; row++){
            int c;
            if (row > n){
                c = 2 * n - row;
            }else {
                c = row;
            }
            for (int space = 1; space <= n - c; space++){
                System.out.printf("  ");
            }
            for (int col = c; col >= 1; col--){
                System.out.printf(col+ " ");
            }
            for (int col = 2; col <= c; col++){
                System.out.printf(col+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}

/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1

 */