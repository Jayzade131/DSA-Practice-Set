package HashSet;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i]))
            {
                nums[k++] =nums[i];
                set.add(nums[i]);

            }
        }

        return k;

    }
}
