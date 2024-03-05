package BinarySearchAlogrithm;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 0;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //when we know array is sorted in ascending  order find the item in array using binary search algo
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // finding mid element
            //int mid = (start+end) /2  might be possible the mid reach the limit of int in java
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
