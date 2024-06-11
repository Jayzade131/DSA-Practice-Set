package Arrayspackage;

public class Triplet {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        increasingTriplet(nums);

    }

    public static boolean increasingTriplet(int[] nums) {

        if (nums.length < 3) {
            return false;
        }
        int first = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for (int i : nums) {

            if (i <= first) {
                first = i;
            } else if (i <= sec) {
                sec = i;

            } else {
                return true;
            }
        }
        return false;
    }

}
