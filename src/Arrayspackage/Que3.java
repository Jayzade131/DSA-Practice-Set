package Arrayspackage;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/description/
public class Que3 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] ans = sumOf1DArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sumOf1DArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            nums[i + 1] = nums[i] + nums[i + 1];
        }
        return nums;
    }
}
