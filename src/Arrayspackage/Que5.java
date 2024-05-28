package Arrayspackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que5 {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;

        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        System.out.println(ans);

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int maxCandies = 0;
        for (int i = 0; i < candies.length; i++) {
            maxCandies = Math.max(candies[i], maxCandies);
        }

        for (int i = 0; i < candies.length; i++) {
            candies[i] = candies[i] + extraCandies;
            if (candies[i] >= maxCandies) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
