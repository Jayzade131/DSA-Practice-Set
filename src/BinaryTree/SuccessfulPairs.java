package BinaryTree;

import java.util.Arrays;

public class SuccessfulPairs {

    public static void main(String[] args) {
        int[] spells = { 5, 1, 3 };
        int[] potions = { 1, 2, 3, 4, 5 };
        int success = 7;
        System.out.println(successfulPairs(spells, potions, success).toString());
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {

        int n = spells.length;
        int m = potions.length;

        Arrays.sort(potions);
        int[] pairs = new int[n];

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            int start = 0;
            int end = m - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;

                long product = (long) spell * potions[mid];

                if (product >= success) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            pairs[i] = m - start;

        }
        return pairs;
    }
}
