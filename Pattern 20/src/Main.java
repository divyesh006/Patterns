public class Main {
    static void pattern(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col < n; col++){
                if (row == 1 || row == n){
                    System.out.printf("* ");
                }else {
                    if (col == 1 || col == n - 1){
                        System.out.printf("* ");
                    }else {
                        System.out.printf("  ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}

/*

 * * * *
 *     *
 *     *
 *     *
 * * * *

 */