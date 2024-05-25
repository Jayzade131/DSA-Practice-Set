package Techniques;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr={2, 3, 5, 8, 9, 10, 11};
        int val=17;
        System.out.println(TwoPointer(arr,val));
    }

    public static boolean TwoPointer(int[] arr,int val)
    {
      int i=0;
      int j= arr.length-1;

      while(i<j)
      {
          if(arr[i]+arr[j]==val)
          {
              return true;
          }
           if(arr[i]+arr[j] < val)
           {
               i++;
           }
           else{
               j--;
           }
      }
      return false;
    }
}
