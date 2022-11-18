package Lecture5_Pattern1;

import java.util.Scanner;

public class AlphaPattern {

    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(n>=0 && n<=26) {
            int currRow = 1;
            char ithChar = 'A';
            while(currRow<=n) {

                int currCol = 1;
                while(currCol<=currRow) {
                    System.out.print(ithChar);
                    currCol++;
                }

                System.out.println();
                ithChar = (char) (ithChar + 1);
                currRow++;
            }

        }

    }

}

//Code : Alpha Pattern
//Send Feedback
//Print the following pattern for the given N number of rows.
//Pattern for N = 3
// A
// BB
// CCC
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 26
//Sample Input 1:
//7
//Sample Output 1:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
//GGGGGGG
//Sample Input 2:
//6
//Sample Output 2:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF