package Lecture2_GettingStartedWithJava.Files;
import java.util.Scanner;
public class TakingInput {
    public static void main(String args[]) {
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        int c=a+b;

        String str=s.nextLine();
        char ch=str.charAt(0);
        System.out.println(ch);
        s.nextDouble();
        s.nextLong();

    }
}
