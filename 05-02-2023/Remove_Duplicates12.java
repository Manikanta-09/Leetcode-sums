import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj =new Scanner(System.in);
        String s = obj.nextLine();
        List<Character> m = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!m.contains(s.charAt(i))){
                m.add(s.charAt(i));
            }
        }
        for(char i: m){
            System.out.print(i);
        }
    }
}
