package Lecture7_OperatorsAndForLoop;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);
        int n = s.nextInt() ,ans = 0, pv = 1;

        while(n > 0) {
            int lastDigit = n % 10;
            ans = ans + pv * lastDigit;
            pv *= 2;
            n /= 10;
        }

        System.out.println(ans);
    }
}

//Binary to decimal
//Send Feedback
//Given a binary number as an integer N, convert it into decimal and print.
//Input format :
//An integer N in the Binary Format
//Output format :
//Corresponding Decimal number (as integer)
//Constraints :
//0 <= N <= 10^9
//Sample Input 1 :
//1100
//Sample Output 1 :
//12
//Sample Input 2 :
//111
//Sample Output 2 :
//7