package CTS_PREPARATION;

public class Multiply {
    /*5 - 0101
    2   - 0010
    ----------
          1010
     */
    void multiplty(int a1,int a2){
        int i=0,s=0;
        while(i<a2){
            s+=a1;
            i++;
        }
        System.out.println(s);
    }
}
