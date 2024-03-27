package SortingAlgo;
//https://leetcode.com/problems/set-mismatch/description/
public class SetMisMatch {
    public static void main(String[] args) {

    }
    static int[] findErrorNums(int[] nums) {
            int i=0;
            while(i<nums.length)
            {
                int correct =nums[i]-1;
                if( nums[i] !=nums[correct] )
                {
                    swapped(nums,i,correct);
                }
                else{
                    i++;
                }
            }
            for (int index = 0; index < nums.length; index++) {
                if(nums[index]!= index+1)
                {
                    return new int[] {index+1,nums[index]};
                }
            }
            return new int[] {-1,-1};

        }
        static void swapped(int[] nums, int first, int second)
        {
            int temp= nums[first];
            nums[first] =nums[second];
            nums[second]=temp;
        }

}
