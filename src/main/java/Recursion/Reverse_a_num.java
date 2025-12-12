package Recursion;

public class Reverse_a_num {
    static int s=0;
    static void fun(int n){
        if(n==0){
            return;
        }
        s=s*10+(n%10);
        fun(n/10);

    }
    static int rev2(int n){
        int d=(int)(Math.log10(n))+1;
        return helper(n,d);
    }
    static int helper(int n,int d){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,d-1))+helper(n/10,d-1);
    }
    static boolean palin(int n){
        return n==rev2(n);
    }
    public static void main(String[] args) {

        System.out.println(palin(121));
    }
}
