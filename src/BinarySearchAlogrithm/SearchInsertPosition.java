package BinarySearchAlogrithm;
//https://leetcode.com/problems/search-insert-position/description/x
public class SearchInsertPosition {

    public static void main(String[] args) {
    int[] nums={1,3,5,6};
    int target = 2;
        System.out.println(search(nums,target));

    }
    static int search(int[] nums,int target)
    {
        int start=0;
        int end= nums.length-1;
        if(target<nums[start])
        {
            return 0;
        }
        if(target>nums[end]){
            return nums.length;
        }

        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(target==nums[mid])
            {
                return mid;
            } else if (target>nums[mid]) {
            start =mid+1;
            }
            else {
                end=mid;
            }
        }
        return start;
    }

}
