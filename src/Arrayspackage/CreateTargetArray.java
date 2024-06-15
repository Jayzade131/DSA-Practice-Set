package Arrayspackage;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {
    public static void main(String[] args) {

        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
    }

    public static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
