package Recursion;

public class fibbo {
    public static void main(String[] args) {
        // Given Number N
        int N = 5;

        // Print the first N numbers
        for (int i = 0; i < N; i++) {

            System.out.print(fibo(i) + " ");
        }
    }
    private static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
