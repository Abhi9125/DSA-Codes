import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(lastIndex(arr,0,x));

    }
     // BY forward recursion
      public static int lastIndex(int[] arr, int idx, int x){
       if(idx == arr.length) return -1;
         

        int rres = lastIndex(arr,idx+1,x);
        if(arr[idx] == x){
            return idx;
        }
        return rres;



    // when Recursion back ward travesed
    // public static int lastIndex(int[] arr, int idx, int x){
    //    if(idx == -1) return -1;

    //     if(arr[idx-1] == x){
    //         return idx-1;
    //     }

    //     int rres = lastIndex(arr,idx-2,x);
    //     return rres;
    }

}