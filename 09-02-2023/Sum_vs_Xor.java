class Result {

    /*
     * Complete the 'sumXor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long sumXor(long n) {
    // Write your code here
        int count=0;
        while(n!=0){
            if((n&1)==0){
                count++;
            }
            n = n>>1;
        }
        return(long) Math.pow(2,count);

    }

}
