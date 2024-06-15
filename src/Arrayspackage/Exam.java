package Arrayspackage;

public class Exam {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };

    }

    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n]; // new array

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }

}
