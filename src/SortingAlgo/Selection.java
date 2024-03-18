package SortingAlgo;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] nums={4,5,1,2,3};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }
    
    static void selection(int[] nums)
    {
        for (int i = 0; i < nums.length ; i++) {
            int last= nums.length -i-1;
           int maxindex=getmaxIndex(nums,0,last);
           swapped(nums,maxindex,last);
        }

    }
    static int getmaxIndex(int[] nums, int start, int end){
            int max=start;
        for (int i = start; i <=end  ; i++) {
            if(nums[max]<nums[i])
            {
                max=i;
            }
        }
        return max;
    }
    static void swapped(int[] nums,int first, int second)
    {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
