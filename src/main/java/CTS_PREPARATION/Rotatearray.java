package CTS_PREPARATION;


public class Rotatearray {
    void rotate(int[] arr,int k){
        k=k%arr.length;
        reverse(arr,0, arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k, arr.length-1);
        for (int j : arr) System.out.print(j + " ");

    }
    static void reverse(int[] nums,int s,int e){
        while(s<e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }
    }
}
