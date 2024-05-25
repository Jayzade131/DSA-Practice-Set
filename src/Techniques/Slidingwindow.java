package Techniques;
//Sliding Window problems are problems in which a fixed or variable-size window is moved through a data structure,
// typically an array or string, to solve problems efficiently based on continuous subsets of elements.
// This technique is used when we need to find subarrays or substrings according to a given set of conditions.
public class Slidingwindow {
    public static void main(String[] args) {
        int num[] ={2,1,5,1,3,2};
        int k=3;
        System.out.println(maxSumSubarray(num,k));
    }

        public static int maxSumSubarray(int[] arr, int k) {


        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer
        int windowSum = 0; // Initialize windowSum

        // Calculate initial windowSum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // Update maxSum and windowSum using sliding window technique
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k]; // Update windowSum
            maxSum = Math.max(maxSum, windowSum); // Update maxSum
        }

        return maxSum;
    }

}
