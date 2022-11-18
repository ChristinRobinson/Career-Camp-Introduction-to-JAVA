package Lecture6_Pattern2;

import java.util.Scanner;

public class HalfDiamondPattern {

    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if( n>=0 && n<=50 ){

            System.out.println("*");

            // First Half
            int currRow = 1;

            while(currRow<=n) {
                System.out.print("*");

                int currCol = 1, num = 1;
                while(currCol <= currRow) {
                    System.out.print(num);
                    num++;
                    currCol++;
                }

                currCol = 1;
                num = currRow - 1;
                while(currCol <= currRow - 1) {
                    System.out.print(num);
                    num--;
                    currCol++;
                }

                System.out.print("*");
                System.out.println();
                currRow++;
            }

            // Second Half
            currRow = n - 1;
            while(currRow >= 1){
                System.out.print("*");

                int currCol = 1, num = 1;
                while(currCol <= currRow){
                    System.out.print(num);
                    num++;
                    currCol++;
                }

                currCol = currRow - 1;
                num = currRow - 1;
                while(currCol >= 1 ) {
                    System.out.print(num);
                    num--;
                    currCol--;
                }
                System.out.print("*");
                System.out.println();
                currRow--;
            }

            System.out.println("*");

        }

    }

}

//Half Diamond Pattern
//Send Feedback
//Write a program to print N number of rows for Half Diamond pattern using stars and numbers
//Note : There are no spaces between the characters in a single line.
//
//
//Input Format :
//A single integer: N
//Output Format :
//Required Pattern
//Constraints :
//0 <= N <= 50
//Sample Input 1 :
//3
//Sample Output 1 :
//*
//*1*
//*121*
//*12321*
//*121*
//*1*
//*
//Sample Input 2 :
// 5
//Sample Output 2 :
//*
//*1*
//*121*
//*12321*
//*1234321*
//*123454321*
//*1234321*
//*12321*
//*121*
//*1*
//*