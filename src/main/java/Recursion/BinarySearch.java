package Recursion;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int t=7;
        int s=0;
        int e=arr.length-1;
        System.out.println(bin(arr,t,s,e));

    }
    static int bin(int[] arr, int t, int s, int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==t){
            return mid;
        }
        if(arr[mid]>t){
            return bin(arr,t,s,mid-1);
        }
        return  bin(arr,t,mid+1,e);

    }


}
