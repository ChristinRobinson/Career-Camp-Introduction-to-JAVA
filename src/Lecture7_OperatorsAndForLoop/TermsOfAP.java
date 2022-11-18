package Lecture7_OperatorsAndForLoop;

import java.util.Scanner;

public class TermsOfAP {

    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        if(x >= 1 && x<= 1000) {
            for(int n = 1, count = 1; count <= x; n++) {
                int term = 3 * n + 2;

                if( !(term % 4 == 0) ) {
                    System.out.print(term + " ");
                    count++;
                }
            }
        }
    }
}

//Terms of AP
//Send Feedback
//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
//Input format :
//Integer x
//Output format :
//Terms of series (separated by space)
//Constraints :
//1 <= x <= 1,000
//Sample Input 1 :
//10
//Sample Output 1 :
//5 11 14 17 23 26 29 35 38 41
//Sample Input 2 :
//4
//Sample Output 2 :
//5 11 14 17