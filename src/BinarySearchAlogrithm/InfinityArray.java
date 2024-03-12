package BinarySearchAlogrithm;

public class InfinityArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,150,180};
        int target = 10;
        int ans = boxArray(arr, target);
        System.out.println(ans);
    }

    static int boxArray(int[] nums, int target)
    {
        int start=0;
        int end=1;
        while(target>nums[end])
        {
          int  tempStart=end+1;
           end=end+(end-start +1)*2;
           start=tempStart;

        }
        return binarySearch(nums,target,start,end);
    }
    static int binarySearch(int[] arr, int target,int start,int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid -1 ;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
