package LinearSearchAlogrithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchMaxvalueIn2D {
    public static void main(String[] args) {
        int[][] arr={
                {4,61,2,8},
                {7,41,1,64,47},
                {26,48,6},
                {25,85}
        };

       int[] ans=  maxvalue2d(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] maxvalue2d(int[][] arr)
    {
        int max=Integer.MIN_VALUE;
        for (int[] element : arr)
        {
            for (int item : element)
            {
                if(item > max)
                {
                    max=item;
                }
            }

        }
        return new int[]{max};
    }
}
