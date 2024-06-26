package Arrayspackage;

public class KadaneAlgorithm {

    public static int myfunc(int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum > maxsum) {
                maxsum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return maxsum;

    }
}
