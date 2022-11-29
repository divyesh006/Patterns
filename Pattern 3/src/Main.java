public class Main {
    static void pattern(int n){
        for (int row = 1; row <= n; row++){
            //for every row, this col run
            for (int col = row; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}