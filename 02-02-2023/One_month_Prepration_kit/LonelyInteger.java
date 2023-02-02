class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i =0;i<a.size();i++){
            if(m.containsKey(a.get(i))){
                m.put(a.get(i),m.get(a.get(i))+1);
            }
            else{
                m.put(a.get(i),1);   
            }
        }
        for(int i =0;i<a.size();i++){
            if(m.get(a.get(i))==1)
                return a.get(i);
        }
        return 0;
    }

}
