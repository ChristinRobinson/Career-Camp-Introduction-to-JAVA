package Lecture6_Pattern2;

import java.util.Scanner;

public class MirrorImageNumberPattern {

    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(n>=0 && n<=50) {
            int currRow = 1;
            while(currRow<=n) {

                int space = 1;
                while(space<=n-currRow){
                    System.out.print(" ");
                    space++;
                }

                int p = 1;
                while(p<=currRow) {
                    System.out.print(p);
                    p++;
                }

                System.out.println();
                currRow++;
            }
        }


    }

}

//Code : Mirror Image Number Pattern
//Send Feedback
//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//
//
//
//
//The dots represent spaces.
//
//
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 50
//Sample Input 1:
//3
//Sample Output 1:
//  1
// 12
//123
//Sample Input 2:
//4
//Sample Output 2:
//   1
//  12
// 123
//1234