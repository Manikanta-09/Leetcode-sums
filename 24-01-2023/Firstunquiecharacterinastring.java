
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> m= new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if (m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),m.get(s.charAt(i))+1);
            }
            else{
                m.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(m.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
