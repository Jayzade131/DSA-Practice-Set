package CodeWithVaishu;

public class ConcatArray {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 6 };
    }

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        int[] arr = new int[n * 2];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            arr[n + i] = nums[i];
        }

        return arr;

    }

}
