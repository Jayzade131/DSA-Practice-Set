package SortingAlgo;

//https://leetcode.com/problems/missing-number/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int ans = findmissingnum(nums);
        System.out.println(ans);
    }

    static int findmissingnum(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swapped(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }

    static void swapped(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
