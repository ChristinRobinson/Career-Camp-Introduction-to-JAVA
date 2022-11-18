package Lecture6_Pattern2;

import java.util.Scanner;

public class OddSquare {

    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if( n>=0 && n<=50 ) {

            int currRow = 1, odd = 1;
            while(currRow <= n) {

                int currCol = (n - currRow) + 1;
                while(currCol >= 1) {
                    System.out.print(odd);
                    odd += 2;
                    currCol--;
                }

                odd = 1;
                currCol = 1;
                while(currCol <= currRow - 1) {
                    System.out.print(odd);
                    odd += 2;
                    currCol++;
                }

                odd += 2;
                System.out.println();
                currRow++;
            }

        }

    }

}

//Odd Square
//Send Feedback
//Write a program to print the pattern for the given N number of rows.
//For N = 4
//1357
//3571
//5713
//7135
//Input Format :
//A single integer: N
//Output Format :
//Required Pattern
//Constraints :
//0 <= N <= 50
//Sample Input 1 :
//3
//Sample Output 1 :
//135
//351
//513
//Sample Input 2 :
// 5
//Sample Output 2 :
//13579
//35791
//57913
//79135
//91357