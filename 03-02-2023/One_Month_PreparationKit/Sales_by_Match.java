class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        int sum = 0;
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<ar.size();i++){
            if(m.containsKey(ar.get(i))){
                m.put(ar.get(i),m.get(ar.get(i))+1);
            }
            else{
                m.put(ar.get(i),1);
            }
        }
        for(Map.Entry<Integer ,Integer> a: m.entrySet()){
            sum+=a.getValue()/2;
        }
        return sum;
    }

}
