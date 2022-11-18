package CourseTest1;

public class FindMaximumSubarraySum {

    public static void main(String[] args) {
        // Write your code here
    }
}

//Find Maximum Sub array Sum
//Send Feedback
//You are given an integer array, arr, of size N and a positive integer K. Out of all sub arrays of 'arr' of size K, find the sum of the sub array that has the maximum sum.
//Input format:
//The first line of the input contains two space-separated integers, N and K
//The second line contains N space-separated integers which represent the elements of the array, arr
//Output format:
//The output only consists of a single integer, the sum of the sub array that has the maximum sum
//Constraints:
//1 <= N <= 10^6
//1 <= K <= N
//Time limit: 1 sec
//Sample Input 1:
//4 1
//1 2 3 4
//Sample Output 1:
//4
//Sample Input 2:
//6 2
//2 7 3 6 7 7
//Sample Output 2:
//14
//Explanation for Sample Output 2:
//There are 5 sub arrays of size 2 in this array. They are {2, 7}, {7, 3}, {3, 6}, {6, 7}, {7, 7}. Since the sub-array {7, 7} has the maximum sum among all the sub arrays, the output will be 7 + 7 = 14