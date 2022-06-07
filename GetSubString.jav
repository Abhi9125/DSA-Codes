import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     String str = scn.nextLine();

     System.out.println(gss(str));


    }

    public static ArrayList<String> gss(String str) {
        // base case and return an empty string arr
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        //  get charecter at 0 idx
        char getchar = str.charAt(0);
        // substring is a String property
        String remString = str.substring(1);  
          
        ArrayList<String> rres = gss(remString);    // function call

        ArrayList<String> ans = new ArrayList<>();  // Create ans array list

        // include
        for(String ss : rres)       //for each loop traves
        ans.add(ss);

        // exclude 
        for(String ss : rres)
        ans.add(getchar+ss);
        
        return ans;
        
    }

}