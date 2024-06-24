package Pratice;

public class que2 {

    public void sortColors(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            boolean test;

            for (int j = 1; j < nums.length - 1; j++) {
                test = false;
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                    test = true;
                }
                if (!test) {
                    break;
                }
            }

        }
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[a] = temp;
    }

}
