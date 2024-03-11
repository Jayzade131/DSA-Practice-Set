package BinarySearchAlogrithm;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class Que2 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] searchRange(int[] nums, int target) {

        int[] ans1={-1,-1};
       int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans1[0]=start;
        ans1[1]=end;
       return ans1;

    }
   static int search(int[] nums,int target,boolean findstartindex) {
        int ans1=-1;
        int start =0;
        int end=nums.length-1;

        while (start <= end) {
            // finding mid element
            //int mid = (start+end) /2  might be possible the mid reach the limit of int in java
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans1= mid;
                if(findstartindex)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return ans1;

    }
}
