class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        Integer[] lst=new Integer[100];
        Arrays.fill(lst,new Integer(0));
        for(int i=0;i<arr.size();i++){
            lst[arr.get(i)]+=1;
        }
        return Arrays.asList(lst);

    }

}
