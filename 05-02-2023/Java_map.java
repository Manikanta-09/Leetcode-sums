import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> m = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            int phno = sc.nextInt();
            sc.nextLine();
            m.put(s,phno);
        }
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            try{
                int ans=m.get(s1);
                System.out.println(s1+"="+ans);
            }catch(Exception e){
                System.out.println("Not found");
            }
        }
    }
}
