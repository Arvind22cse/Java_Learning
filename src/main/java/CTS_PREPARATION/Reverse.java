package CTS_PREPARATION;

public class Reverse {
    void reverse(int n){
        int s=0;
        while(n!=0){
            int r=n%10;
            s=s*10+r;
            n/=10;
        }
        System.out.println(s);

    }
}
