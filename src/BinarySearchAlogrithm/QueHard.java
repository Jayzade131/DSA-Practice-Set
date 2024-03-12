package BinarySearchAlogrithm;

public class QueHard {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,3,1};
        int target=3;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums,int target)
    {
            int peak=peakelement(nums);
            int firstTry=binarySearch1(nums,target,0,peak);
            if(firstTry!=-1)
            {
                return firstTry;
            }
            return binarySearch1(nums,target,peak+1, nums.length-1);
    }
    static int peakelement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int binarySearch1(int[] arr, int target ,int start,int end) {

        boolean isAscd = arr[start] < arr[end];

        while (start <= end) {
            // finding mid element
            //int mid = (start+end) /2  might be possible the mid reach the limit of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAscd) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }


        }
        return -1;
    }

}
