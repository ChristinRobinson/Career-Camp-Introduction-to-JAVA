package Lecture8_FunctionsAndScope;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(checkMember(n));
    }

    public static boolean checkMember(int n){

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if(n == 0 || n == 1) {
            return true;
        }

        int prev = 0, current = 1;
        int fib = prev + current;
        while(fib <= n) {
            if(fib == n) {
                return true;
            }

            prev = current;
            current = fib;
            fib = prev + current;
        }

        return false;

    }
}

//Fibonacci Number
//Send Feedback
//Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
//Fibonacci Series is defined by the recurrence
//    F(n) = F(n-1) + F(n-2)
//where F(0) = 0 and F(1) = 1
//
//
//Input Format :
//Integer N
//Output Format :
//true or false
//Constraints :
//0 <= n <= 10^4
//Sample Input 1 :
//5
//Sample Output 1 :
//true
//Sample Input 2 :
//14
//Sample Output 2 :
//false