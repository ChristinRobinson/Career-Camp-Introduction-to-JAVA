package Lecture4_ConditionalsAndLoops.Files;
import  java.util.Scanner;
public class ConditionalAndRelational {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        if(a!=b){
            System.out.println("Not Equal");
        }else{
            System.out.println("Equal");
        }
        //if(a>0||b>0){
        //  System.out.println("One is positive");
        //}else{
        //  System.out.println("None is positive");
        //}
    }
}