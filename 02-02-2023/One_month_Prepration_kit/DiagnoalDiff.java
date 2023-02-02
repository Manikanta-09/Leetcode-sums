class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int sum1=0;
        int sum2=0;
        int j ;
        for(int i=0;i<arr.size();i++){
            sum1+=arr.get(i).get(i);
            sum2+=arr.get(i).get(arr.size()-1-i);
        }
        return Math.abs(sum1-sum2);

    }

}
