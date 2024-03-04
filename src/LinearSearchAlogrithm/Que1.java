package LinearSearchAlogrithm;

import java.util.Arrays;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class Que1 {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
                int ans=findEven(arr);
        System.out.println(ans);
    }

    static int findEven(int[] arr) {
        int count = 0;
        for (int element : arr) {
            if (even(element)) {
                count++;
            }
        }
        return count;
    }

    static int digit(int num) {
        int cal = 0;
        while (num > 0) {
            cal++;
            num = num / 10;
        }
        return cal;
    }

    static boolean even(int num) {
        int noOfDigits = digit(num);
        return noOfDigits %2==0;
    }

}
