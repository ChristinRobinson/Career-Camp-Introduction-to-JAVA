package Lecture4_ConditionalsAndLoops.Files;
import java.util.Scanner;
public class ReturnKeyword {
    public static void main(String args[]) {

        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int div=2;
        boolean isPrime=true;

        while(div<=n-1){
            if(n%div==0){

                System.out.println("Composite");

                return;

            }
            div=div+1;
        }

    }
}