class Result {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
    // Write your code here
        List<String> s = new ArrayList<>(); 
        for(int i =0;i<grid.size();i++){
            char[] ch = grid.get(i).toCharArray();
            Arrays.sort(ch);
            s.add(new String(ch));
        }
        int a = s.get(0).length();
        for(int i=1;i<s.size();i++){
            for(int j=0;j<a;j++){
                if(s.get(i-1).charAt(j)>s.get(i).charAt(j)){
                    return "NO";
                }
            }
        }
        return "YES";

    }

}
