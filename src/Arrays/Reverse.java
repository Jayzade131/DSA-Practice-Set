package Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] element={10,4,3,6,7,9};

        reverseArray(element);
        System.out.println(Arrays.toString(element));

     }

     static void reverseArray(int[] element)
     {
         int start=0;
         int end = element.length-1;
         while(start < end)
         {
             swap(element,start,end);
             start++;
             end--;

         }
     }

    static void swap(int[] element,int index1, int index2)
    {
        int temp =element[index1];
        element[index1]=element[index2];
        element[index2]=temp;
    }


}
