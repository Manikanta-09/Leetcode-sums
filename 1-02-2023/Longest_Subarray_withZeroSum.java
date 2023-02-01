import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		int sum =0;
		int len =0;
		for(int i=0;i<arr.size();i++){
			sum += arr.get(i);
			if(sum==0)
				len =i+1;
			else{
				if(m.get(sum)!=null){
					len= Math.max(len, i-m.get(sum));
				}
				else{
					m.put(sum,i);
				}
			}
		}
		return len;

	}
}
