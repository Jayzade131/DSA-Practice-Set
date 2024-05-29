package HashSetQUE;

import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;

public class DifferenceofTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4, 6 };
        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int num1 : nums1) {
            set1.add(num1);

        }
        for (int num2 : nums2) {
            set2.add(num2);

        }

        for (int checknum1 : set1) {
            if (!set2.contains(checknum1)) {
                ans1.add(checknum1);
            }
        }
        ans.add(ans1);
        for (int checknum2 : set2) {
            if (!set1.contains(checknum2)) {
                ans2.add(checknum2);
            }
        }
        ans.add(ans2);

        return ans;

    }

}