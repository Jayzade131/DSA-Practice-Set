package HashSetQUE;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                list.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        int[] arr3 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr3[i] = list.get(i);
        }

        return arr3;
    }
}
