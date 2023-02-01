import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        HashSet<Integer> s = new HashSet<Integer>();
        for(int num : arr){
            s.add(num);
        }
        int len =0;
        for(int num : arr){
            if(!s.contains(num-1)){
                int curr = num;
                int curr_len=1;
                while(s.contains(curr+1)){
                    curr +=1;
                    curr_len+=1;
                }
                len = Math.max(len,curr_len);
            }
        }
        return len;
    }
}
