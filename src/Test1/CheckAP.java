package Test1;

import java.util.Scanner;

public class CheckAP {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int prevNum = s.nextInt();
        int currNum = s.nextInt();
        int diff = currNum - prevNum;
        prevNum = currNum;

        for(int count = 3; count <= n; count++) {
            currNum = s.nextInt();

            if(currNum - prevNum != diff) {
                System.out.println("false");
                return;
            }
            prevNum = currNum;
        }
        System.out.println("true");
    }
}

//Check AP
//Send Feedback
//Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
//Input format :
//Line 1 : n
//Line 2 : n numbers
//Sample Input 1 :
//6
//2 6 10 14 18 22
//Sample Output 1 :
//true
//Sample Input 2 :
//6
//2 6 10 15 19 23
//Sample Output 2 :
//false