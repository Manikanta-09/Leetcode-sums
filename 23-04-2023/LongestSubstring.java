class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character ,Integer> m = new HashMap<Character ,Integer>();
        int r =0 ,l =0;
        int len = 0;
        int n =s.length();
        while(r<n){
            if(m.containsKey(s.charAt(r)))
                l = Math.max(m.get(s.charAt(r))+1,l);

            m.put(s.charAt(r),r);
            len = Math.max((r-l+1),len);
            r++;
        }
        return len;
    }
}
