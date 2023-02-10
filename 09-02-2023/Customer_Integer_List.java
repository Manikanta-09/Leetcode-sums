import java.io.*;
import java.util.*;

class IntegerList{
    private List<Integer> lst;
    private int index =0;
    private int size;
    IntegerList(int size){
        this.size = size;
        lst = new ArrayList<>();
    }
    public void addm(int num){
        if(index >size - 1){
            System.out.println("can't add, list is full");
        }
        else{
            lst.add(num);
            index+=1;
        }
    }
    public void toStrin(){
        int j =0;
        for (int i : lst){
            System.out.println(j+" : "+i);
                j+=1;
        }
        
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int capacity = Integer.parseInt(in.nextLine());
        IntegerList nums = new IntegerList(capacity);
        while(in.hasNextLine()){
            int number = Integer.parseInt(in.nextLine());
            nums.addm(number);
        }
        nums.toStrin();
    }
}
