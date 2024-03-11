package BinarySearchAlogrithm;

public class Celling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return the index of smallest number >= target
    static int binarySearch(int[] arr, int target) {
        //if end is small than target
        if(arr[arr.length-1]<target){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
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
        return start;
    }
}
