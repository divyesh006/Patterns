public class Main {
    static void pattern(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                if ((row + col) % 2 == 0){
                    System.out.printf("1 ");
                }else {
                    System.out.printf("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}