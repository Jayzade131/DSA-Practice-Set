package LinearSearchAlogrithm;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
            int[][] arr={
                    {4,61,2,8},
                    {7,41,1,64,47},
                    {26,48,6},
                    {25,85}
            };
            int target=48;
           int[] ans= searchIn2dArray(arr,target);
        System.out.println(Arrays.toString(ans));
    }


    static int[] searchIn2dArray(int[][] arr,int target)
    {
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                        if(arr[row][col]==target)
                        {
                            return new int[]{row, col};
                        }
            }

        }
        return new int[]{-1, -1};
    }
}
