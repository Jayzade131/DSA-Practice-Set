package Arrayspackage;

import java.util.Arrays;

public class Que2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] ans = arrconcat(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] arrconcat(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n * 2];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];

        }
        for (int i = 0; i < n; i++) {
            arr[i + n] = nums[i];
        }
        return arr;
    }

}
