import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String[] input = sc.nextLine().split(" ");
            Student s = new Student(input[0],Integer.parseInt(input[1]),input[2],Integer.parseInt(input[3]));
            String[] marks = sc.nextLine().split(" ");
            for(String m: marks)
                s.addmark(Integer.parseInt(m));
            s.display();
            System.out.printf(s.getRollNo()+" "+"%.2f\n",s.averagePer());
        }
        System.out.println("NoOfStudents="+Student.getNoOfStudents());
    }
}
class Student{
    private String name;
    private int rollno;
    private String branch;
    private int year;
    private List<Integer> marks;
    private static int noofStudents =0;
    public Student(String name,int rollno,String branch,int year){
        this.name=name;
        this.rollno=rollno;
        this.branch=branch;
        this.year=year;
        marks = new ArrayList<>();
        noofStudents++;
        
    }
    public String getname(){
        return name;
    }
    public int getRollNo(){
        return rollno;
    }
    public String getbranch(){
        return branch;
    }
    public int getyear(){
        return year;
    }
    public static int getNoOfStudents(){
        return noofStudents++;
    }
    public void addmark(int mark){
        marks.add(mark);
    }
    public void display(){
        System.out.println(rollno+" "+name+" "+branch+" "+year);
    }
    public double averagePer(){
        if(marks.size()==0){
            return 0;
        }
        double sum =0;
        for(Integer mark : marks){
            sum+=mark;
        }
        return (sum/marks.size());
    }
}
