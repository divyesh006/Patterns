public class Main {
    static void pattern(int n){
        int count = 1;
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.printf(count++ +"  ");
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
2  3
4  5  6
7  8  9  10
11  12  13  14  15

 */