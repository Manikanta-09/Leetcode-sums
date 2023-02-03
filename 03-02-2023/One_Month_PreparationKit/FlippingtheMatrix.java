class Result {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

   public static int flippingMatrix(List<List<Integer>> matrix) {
    // Write your code here
    int n=matrix.size();
    int sum=0;
    for (int i = 0; i < n/2; i++) {
        for (int j = 0; j < n/2; j++) {
            sum += Math.max(Math.max(matrix.get(i).get(j), matrix.get(i).get(n-j-1)), 
            Math.max(matrix.get(n-i-1).get(j), matrix.get(n-i-1).get(n-j-1)));
        }
    }
    return sum;
    }

}
