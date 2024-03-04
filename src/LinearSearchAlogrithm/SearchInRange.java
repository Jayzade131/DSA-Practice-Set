package LinearSearchAlogrithm;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {3, 67, 78, 3, 63, 76};
        int target = 78;
        int start = 1;
        int end = 4;
      int ans= searchitem(nums,target,start,end);
        System.out.println(ans);
    }

    static int searchitem(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;

        }
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;
    }

}