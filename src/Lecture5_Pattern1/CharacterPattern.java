package Lecture5_Pattern1;

import java.util.Scanner;

public class CharacterPattern {

    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(n>=0 && n<=13) {
            int currRow = 1;
            char ch;
            while(currRow<=n) {

                int currCol = 1;
                ch = (char) ('A' + (currRow -1));
                while(currCol<=currRow) {
                    System.out.print(ch);
                    ch = (char) (ch + 1);
                    currCol++;
                }

                System.out.println();
                currRow++;
            }
        }

    }

}

//Code : Character Pattern
//Send Feedback
//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//A
//BC
//CDE
//DEFG
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 13
//Sample Input 1:
//5
//Sample Output 1:
//A
//BC
//CDE
//DEFG
//EFGHI
//Sample Input 2:
//6
//Sample Output 2:
//A
//BC
//CDE
//DEFG
//EFGHI
//FGHIJK