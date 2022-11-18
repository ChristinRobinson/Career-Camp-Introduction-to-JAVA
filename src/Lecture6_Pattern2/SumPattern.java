package Lecture6_Pattern2;

import java.util.Scanner;

public class SumPattern {

    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n>=0 && n<=50){

            int currRow = 1;
            while(currRow <= n) {

                int sum = 0;
                int currCol = 1;
                while(currCol <= currRow) {
                    System.out.print(currCol);

                    if(currCol < currRow) {
                        System.out.print("+");
                    }

                    sum += currCol;
                    currCol++;
                }

                System.out.print("=" + sum);
                System.out.println();
                currRow++;
            }

        }

    }

}

//Sum Pattern
//Send Feedback
//Write a program to print triangle of user defined integers sum.
//Input Format :
//A single integer, N
//Output Format :
//Required Pattern
//Constraints :
//0 <= N <= 50
//Sample Input 1 :
//3
//Sample Output 1 :
//1=1
//1+2=3
//1+2+3=6
//Sample Input 2 :
// 5
//Sample Output 2 :
//1=1
//1+2=3
//1+2+3=6
//1+2+3+4=10
//1+2+3+4+5=15