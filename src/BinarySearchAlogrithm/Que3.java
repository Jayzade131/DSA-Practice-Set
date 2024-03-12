package BinarySearchAlogrithm;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class Que3 {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 0};
      int ans=  peakelement(nums);
        System.out.println(ans);
    }

    static int peakelement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
