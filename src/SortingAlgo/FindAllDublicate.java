package SortingAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDublicate {
    public static void main(String[] args) {
     int[]   nums = {4,3,2,7,8,2,3,1};

    }
  static List<Integer> findDuplicates(int[] nums) {
      int i=0;
      while(i<nums.length)
      {
          int correct =nums[i]-1;
          if(nums[i] < nums.length && nums[i] !=nums[correct] )
          {
              swapped(nums,i,correct);
          }
          else{
              i++;
          }
      }
      ArrayList<Integer> list=new ArrayList<>();
      for (int index = 0; index < nums.length; index++) {
          if(nums[index]!= index+1)
          {
             list.add(nums[index] );
          }
      }
      return list;
    }
    static void swapped(int[] nums, int first, int second)
    {
        int temp= nums[first];
        nums[first] =nums[second];
        nums[second]=temp;
    }
}
