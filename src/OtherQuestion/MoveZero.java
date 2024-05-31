package OtherQuestion;

public class MoveZero {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) // length is the property of the array
            System.out.println(nums[i]);
    }

    public static void moveZeroes(int[] nums) {
        int insert = 0;

        for (int i : nums) {
            if (i != 0) {
                nums[insert++] = i;
            }
        }

        while (insert < nums.length) {
            nums[insert++] = 0;
        }

    }

}
