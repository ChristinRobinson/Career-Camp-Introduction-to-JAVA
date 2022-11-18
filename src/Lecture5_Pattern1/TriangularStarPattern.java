package Lecture5_Pattern1;

import java.util.Scanner;

public class TriangularStarPattern {

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

                int currCol = 1;
                while(currCol<=currRow) {
                    System.out.print('*');
                    currCol++;
                }

                System.out.println();
                currRow++;
            }
        }

    }

}

//Code : Triangular Star Pattern
//Send Feedback
//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//*
//**
//***
//****
//Note : There are no spaces between the stars (*).
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 50
//Sample Input 1:
//5
//Sample Output 1:
//*
//**
//***
//****
//*****
//Sample Input 2:
//6
//Sample Output 2:
//*
//**
//***
//****
//*****
//******