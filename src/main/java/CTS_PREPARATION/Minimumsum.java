package CTS_PREPARATION;

import java.util.*;

public class Minimumsum {
    /*given 2 array A and B . You may swap any elements of A with B.Goal is to minimize the sum
    1 2 3
    3 2 2
    4+4+5
    */
    void minimum(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        reverse(arr2);
        int s=0;
        for(int i=0;i<arr1.length;i++){
            s+=arr1[i]*arr2[i];
        }
        System.out.println(s);
    }
    void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
