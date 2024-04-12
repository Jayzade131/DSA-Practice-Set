package Recursion;

public class BSRecursion {
    public static void main(String[] args) {
        int[] arr={1,5,3,8,34,9,4};
        int target=4;
       int ans= search(arr,target,0, arr.length-1);
        System.out.println(ans);
    }

    static  int search(int[] arr,int target,int start,int end)
    {
        if(start>end)
        {
            return -1;
        }

        int mid= start + (end-start)/2;

        if(arr[mid]==target)
        {
            return mid;
        }

        if(target < arr[mid])
        {
            return  search(arr, target, start, mid-1);
        }

        return search(arr,target,mid+1,end);

    }
}
