package Test1;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int result = 0;
        for(int p = n, lastDigit; p > 0; p /= 10) {
            lastDigit = p % 10;
            result = (result * 10) + lastDigit;
        }
        if(result == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

//Palindrome number
//Send Feedback
//Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
//Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
//Sample Input 1 :
//121
//Sample Output 1 :
//true
//Sample Input 2 :
//1032
//Sample Output 2 :
//false