package TwoPointer;

import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 7, 4, 8 };

        System.out.println(Arrays.toString(swapping(arr)));
    }

    public static int[] swapping(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        return arr;
    }

}
