package Recursion;

public class Reverse {
    public static void main(String[] args) {
//        fun(5);
        fun2(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
    static void fun2(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        fun2(n-1);
    }
}
