package Recursion;

public class fact {
    public static void main(String[] args) {
        int ans=fun(5);
        System.out.println(ans);
    }
    static int fun(int n){
        if(n<=1){
            return 1;
        }

        return fun(n%10);
        /*
        521 =

         */
    }
}
