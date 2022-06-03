import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int src = scn.nextInt();
        int des = scn.nextInt();
        int helper = scn.nextInt();
        toh(n, src,des,helper);

    }

    public static void toh(int n, int src, int des, int helper){
       if(n==0) return;
        toh(n-1,src,helper,des);
        System.out.println(n+"["+src+" -> "+des+"]");
        toh(n-1,helper,des,src);
        
    }

}