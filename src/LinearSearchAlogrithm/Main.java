package LinearSearchAlogrithm;

public class Main {
    public static void main(String[] args) {
            int[] nums={8,4,3,7,10,-11,6,5,-9};
            int target=7;
       boolean ans=  liearnSearch2(nums,target);
        System.out.println(ans);


    }
        //search in the array and rertun the item if found
            // if item not found return -1
//    static int liearnSearch(int[] arr,int target)
//    {
//        if(arr.length==0)
//        {
//            return -1;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//                int element=arr[i];
//                if(target==element)
//                {
//                    return i;
//                }
//        }
//        return -1;
//    }

    //search in the array and rertun the item
// if item not found return -1
//    static int liearnSearch1(int[] arr,int target)
//    {
//        if(arr.length==0)
//        {
//            return -1;
//        }
//
//        for (int element : arr)
//        {
//            if(element==target)
//            {
//                return element;
//            }
//        }
//        return Integer.MAX_VALUE;
//    }

    //search in the array and rertun the true
// if item not found return false
    static boolean liearnSearch2(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return false;
        }

        for (int element : arr)
        {
            if(element==target)
            {
                return true;
            }
        }
        return false;
    }
}





