package SortingAlgo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={3,1,5,4,2};
        search(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void search(int[] nums ){
    boolean swapped;
            //run steps n-1 times
        for (int i = 0; i < nums.length ; i++) {
            swapped=false;

            for (int j = 1; j < nums.length-i ; j++) {
                if(nums[j]<nums[j-1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;
                }

            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
