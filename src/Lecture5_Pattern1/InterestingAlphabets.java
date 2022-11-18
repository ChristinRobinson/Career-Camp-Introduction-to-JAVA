package Lecture5_Pattern1;

import java.util.Scanner;

public class InterestingAlphabets {

    public static void main(String[] args) {
        //Your code goes here

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(n>=0 && n<=26)  {
            int currRow = 1;
            char ch;
            while(currRow<=n) {
                int currCol = 1;
                ch = (char) ('A' + (n-currRow));
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

//Code : Interesting Alphabets
//Send Feedback
//Print the following pattern for the given number of rows.
//Pattern for N = 5
//E
//DE
//CDE
//BCDE
//ABCDE
//Input format :
//N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 26
//Sample Input 1:
//8
//Sample Output 1:
//H
//GH
//FGH
//EFGH
//DEFGH
//CDEFGH
//BCDEFGH
//ABCDEFGH
//Sample Input 2:
//7
//Sample Output 2:
//G
//FG
//EFG
//DEFG
//CDEFG
//BCDEFG
//ABCDEFG