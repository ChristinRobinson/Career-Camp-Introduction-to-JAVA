package Lecture6_Pattern2;

import java.util.Scanner;

public class StarPattern {

    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n>=0 && n<=50){

            int i = 1;
            while(i<=n) {

                int space = 1;
                while(space <= n-i) {
                    System.out.print(" ");
                    space++;
                }

                int increasingStar = 1;
                while(increasingStar <= i) {
                    System.out.print('*');
                    increasingStar++;
                }

                int decreasingStar = 1;
                while(decreasingStar < i) {
                    System.out.print('*');
                    decreasingStar++;
                }
                System.out.println();
                i++;

            }

        }

    }

}

//Code : Star Pattern
//Send Feedback
//Print the following pattern,
//Pattern for N = 4
//
//
//
//The dots represent spaces.
//
//
//
//Input Format :
//N (Total no. of rows)
//Output Format :
//Pattern in N lines
//Constraints :
//0 <= N <= 50
//Sample Input 1 :
//3
//Sample Output 1 :
//   *
//  ***
// *****
//Sample Input 2 :
//4
//Sample Output 2 :
//    *
//   ***
//  *****
// *******