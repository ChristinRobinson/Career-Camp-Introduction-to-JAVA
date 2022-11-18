package Lecture6_Pattern2;

import java.util.Scanner;

public class TriangleOfNumbers {

    public static void main(String[] args) {
        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n>=0 && n<=50){

            int num = 1;
            int currRow = 1;
            while(currRow <= n) {

                int space = 1;
                while(space <= (n - currRow)){
                    System.out.print(" ");
                    space++;
                }

                int increasingCol = 1 ;
                int increment = num;
                while(increasingCol <= currRow){
                    System.out.print(increment);
                    increasingCol++;
                    increment++;
                }

                int decreasingCol = 1;
                int decrement = increment - 2;
                while(decreasingCol < currRow){
                    System.out.print(decrement);
                    decreasingCol++;
                    decrement--;
                }

                System.out.println();
                num++;
                currRow++;
            }

        }

    }

}

//Code : Triangle of Numbers
//Send Feedback
//Print the following pattern for the given number of rows.
//Pattern for N = 4
//
//
//
//The dots represent spaces.
//
//
//
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints :
//0 <= N <= 50
//Sample Input 1:
//5
//Sample Output 1:
//       1
//      232
//     34543
//    4567654
//   567898765
//Sample Input 2:
//4
//Sample Output 2:
//        1
//       232
//      34543
//     4567654