class Result {

    /*
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
    // Write your code here 
        List<Integer> n = new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                 if(arr.get(i)+arr.get(j)==m){
                    n.add(i+1);
                    n.add(j+1);
                }
            }
        }
        return n;

    }

}
