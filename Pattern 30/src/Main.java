public class Main {
    static void pattern(int n){
        for (int row = 1; row <= n; row++){
            for (int space = 1; space <= n -row; space++){
                System.out.printf("  ");
            }
            for (int col = row; col >= 1; col--){
                System.out.printf(col+ " ");
            }
            for (int col = 2; col <= row; col++){
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

 */