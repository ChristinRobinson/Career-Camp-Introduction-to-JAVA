package Lecture12_Strings;

//public class CompressTheString {
//
//    public static class Solution {
//        public static String getCompressedString(String str) {
//            // Write your code here.
//        }
//
//    }
//
//    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
//
//    public static void main (String [] args) throws NumberFormatException, IOException {
//        String str = br.readLine ();
//        if (str != null) {
//            str = str.trim ();
//        } else {
//            str = "";
//        }
//
//        String ans = Solution.getCompressedString(str);
//        System.out.println(ans);
//    }
//}

//Compress the String
//Send Feedback
//Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
//Example:
//If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".
//
//The string is compressed only when the repeated character count is more than 1.
//Note:
//Consecutive count of every character in the input string is less than or equal to 9.
//Input Format:
//The first and only line of input contains a string without any leading and trailing spaces.
//Output Format:
//The output contains the string after compression printed in single line.
//Note:
//You are not required to print anything. It has already been taken care of. Just implement the given function.
//Constraints:
//0 <= N <= 10^6
//
//Where 'N' is the length of the input string.
//
//Time Limit: 1 sec
//Sample Input 1:
//aaabbccdsa
//Sample Output 1:
//a3b2c2dsa
//Explanation for Sample Output 1:
//In the given string 'a' is repeated 3 times, 'b' is repeated 2 times, 'c' is repeated 2 times and 'd', 's' and 'a' and occurring 1 time hence no compression for last 3 characters.
//Sample Input 2:
//aaabbcddeeeee
//Sample Output 2:
//a3b2cd2e5
//Explanation for Sample Output 2:
//In the given string 'a' is repeated 3 times, 'b' is repeated 2 times, 'c' is occurring single time, 'd' is repeating 2 times and 'e' is repeating 5times.