package Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 1, 3 };
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int element : arr) {
            count.put(element, count.getOrDefault(element, 0) + 1);
        }

        HashSet<Integer> occ = new HashSet<>();
        for (Integer countocc : count.values()) {
            if (!occ.add(countocc)) {
                return false;
            }
        }
        return true;
    }

}
