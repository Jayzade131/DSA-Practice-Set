package Techniques;

class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int result = minSubArrayLen(target, nums);
        System.out.println("Minimum length of subarray: " + result);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        while (j <= nums.length) {
            sum += nums[j];
            if (sum >= target) {
                while (sum >= target) {
                    min = Math.min(min, j - i + 1);
                    sum -= nums[i];
                    i++;
                }
            }
            j++;
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}