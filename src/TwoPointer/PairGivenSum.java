package TwoPointer;

//Finding a Pair with a Given Sum
public class PairGivenSum {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 6 };
        int target = 6;

        System.out.println(findingPair(arr, target));

    }

    public static boolean findingPair(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int cur = arr[start] + arr[end];
            if (cur == target) {
                return true;
            } else if (cur < target) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
}
