import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        System.out.println(getStairPaths(n));

    }

    public static ArrayList<String> getStairPaths(int n) {
        //Base Case
        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans= new ArrayList<>();

        // for 1 step
        if(n >= 1){
            ArrayList<String> rres = getStairPaths(n-1);

            for(String ss : rres){
                ans.add('1'+ss);
            }
        }

        // for 2 step
        if(n >= 2){
            ArrayList<String> rres = getStairPaths(n-2);

             for(String ss : rres){
                ans.add('2'+ss);
            }
        }

        // for 3 step
        if(n >= 3){
            ArrayList<String> rres = getStairPaths(n-3);

             for(String ss : rres){
                ans.add('3'+ss);
            }
        }
        return ans;
    }

}