class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        while(n.length() * k > 1)
        {
            long sum = 0;
            for(int i = 0; i < n.length(); i++)
            {
                sum += n.charAt(i) - '0' ;
            }
            n = "" + sum * k;
            k = 1;
        }        
        return Integer.parseInt(n);
    }

}
