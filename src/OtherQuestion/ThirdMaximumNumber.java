package OtherQuestion;

class ThirdMaximumNumber {
    public static void main(String[] args) {

    }

    public static int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int num : nums) {

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;

            } else if (max1 > num && num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max2 > num && num > max3) {
                max3 = num;

            }
        }
        return max3 != Integer.MIN_VALUE ? max2 : max1;

    }
}