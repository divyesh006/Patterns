public class Main {
    static void pattern(int n){
        int orignalN = n;
        n = 2 * n;
        for (int row = 0; row < n - 1; row++){
            for (int col = 0; col < n - 1; col++){
                int elementAtIndex = orignalN - Math.min(Math.min(row, col), Math.min(n - row - 2, n - col - 2));
                System.out.printf(elementAtIndex+ " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern(4);
    }
}
/*
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
 */