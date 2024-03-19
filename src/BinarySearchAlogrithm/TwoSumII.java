package BinarySearchAlogrithm;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
     int[] numbers={2,7,11,15};
     int target=9;
        int[] ans = twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] numbers, int target) {

        int left=0;
        int right= numbers.length-1;


        while (left<right)
        {
            int sum=numbers[left]+numbers[right];
            if (sum==target)
            {
                return new int[] {left+1,right+1};
            }

            if(sum<target)
            {
                left++;
            }
            else{
                right--;
            }
        }

    return new int[] {};
    }
}
