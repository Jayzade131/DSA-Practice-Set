package Arrayspackage;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;

            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                return digits;
            }
        }

        int[] arr = new int[digits.length + 1];
        arr[0] = 1;

        return arr;

    }

}
