package Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/description/
public class Que4 {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
       int[] ans= shuffleArray(nums,n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] shuffleArray(int[] nums,int n)
    {

       int[] arr=new int[n*2];
        for (int i = 0; i <n ; i++) {
            arr[i*2]=nums[i];
            arr[(i*2)+1]=nums[n+i];
        }
        return arr;

    }
}
