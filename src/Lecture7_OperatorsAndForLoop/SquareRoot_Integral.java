package Lecture7_OperatorsAndForLoop;

import java.util.Scanner;

public class SquareRoot_Integral {

    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int output = 0;
        while(output * output <= n) {
            output++;
        }
        output -= 1;

        System.out.println(output);
    }
}

//Square Root (Integral)
//Send Feedback
//Given a number N, find its square root. You need to find and print only the integral part of square root of N.
//For e.g. if number given is 18, answer is 4.
//Input format :
//Integer N
//Output Format :
//Square root of N (integer part only)
//Constraints :
//0 <= N <= 10^8
//Sample Input 1 :
//10
//Sample Output 1 :
//3
//Sample Input 2 :
//4
//Sample Output 2 :
//2