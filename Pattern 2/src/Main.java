public class Main {
    static void pattern(int n){
        for (int row = 1; row <= n; row++){
            // for every row, run the col
            for (int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            // after printing one row, we need new line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}