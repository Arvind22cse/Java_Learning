package CTS_PREPARATION;
import java.util.*;
public class Duplicate {
    void duplicate(int[] arr){
        HashSet<Integer> hs=new HashSet<>();
        for(int x:arr){
            hs.add(x);
        }
        System.out.println(hs);

        int l=0;
        int r=arr.length-1;
        int[] arr2=new int[r+1];
        while(l<r){
            if(arr[l]!=arr[r]){
                arr2[l]=arr[l];
                arr2[r]=arr[r];
                l++;
                r--;
            }
            else{
                arr2[l]=arr[l];
                int t=arr[r];
                arr2[r]=arr[r+1];
                arr2[r+1]=t;
                r--;
            }
        }
        for (int j : arr2) System.out.println(j);
    }
}
