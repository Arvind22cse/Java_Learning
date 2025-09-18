package CTS_PREPARATION;

public class Fibonnici_number {
    // 1 1 2 3 5 8 13
    void fibonnoci(int n){
        int a1=1,a2=1;
        System.out.println(a1+" "+a2+" ");
        int i=2,s=0;
        while(i<n){

            s=a1+a2;
            System.out.println(s+" ");
            a1=a2;
            a2=s;
            i++;
//            int t=a1;
//            a2=a1;
//            a1=s;
//            i++;
        }

    }
}
