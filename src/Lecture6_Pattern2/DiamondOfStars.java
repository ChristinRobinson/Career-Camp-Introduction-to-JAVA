package Lecture6_Pattern2;

import java.util.Scanner;

public class DiamondOfStars {

    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if((n>= 0 && n<=49) && n % 2 == 1){

            int n1 = ( n + 1 ) / 2;
            int n2 = n1 - 1;

            int currRow = 1;
            while( currRow <= n1 ){

                int space = 1;
                while( space <= n1 - currRow ) {
                    System.out.print(" ");
                    space++;
                }

                int star = 1 ;
                while( star <= ( 2 * currRow ) - 1 ){
                    System.out.print("*");
                    star++;
                }

                System.out.println();
                currRow++;
            }

            currRow = n2;
            while( currRow >= 1){

                int space = 1;
                while( space <= ( n2 - currRow ) + 1 ){
                    System.out.print(" ");
                    space++;
                }

                int star = 1;
                while( star <= ( 2 * currRow ) - 1 ){
                    System.out.print("*");
                    star++;
                }

                System.out.println();
                currRow--;
            }

        }

    }

}

//Code : Diamond of stars
//Send Feedback
//Print the following pattern for the given number of rows.
//Note: N is always odd.
//
//
//Pattern for N = 5
//
//
//
//The dots represent spaces.
//
//
//
//Input format :
//N (Total no. of rows and can only be odd)
//Output format :
//Pattern in N lines
//Constraints :
//1 <= N <= 49
//Sample Input 1:
//5
//Sample Output 1:
//  *
// ***
//*****
// ***
//  *
//Sample Input 2:
//3
//Sample Output 2:
//  *
// ***
//  *