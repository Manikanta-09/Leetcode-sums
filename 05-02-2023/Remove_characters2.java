import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        HashSet<Character> st = new HashSet<>();
        for (int i=0; i<str2.length();i++) {
          st.add(str2.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str1.length();i++) {
          if (!st.contains(str1.charAt(i))) {
            sb.append(str1.charAt(i));
             
          }else{
              st.remove(str1.charAt(i));
          }
        }
        System.out.println(sb.toString());
    }
}
