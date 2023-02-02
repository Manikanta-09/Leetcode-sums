class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
        boolean pangram= true;
        s = s.toLowerCase();
        for(char ch='a';ch<='z';ch++){
            if(!s.contains(s.valueOf(ch))){
                pangram=false;
            }
        }
        if(pangram==true){
            return "pangram";
        }
        return "not pangram";

    }

}
