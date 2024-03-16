package BinarySearchAlogrithm;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
    int[][] matrix ={{10,20,30,40},
                     {15,25,35,45},
                     {19,29,38,48},
                     {33,34,39,50}};
    int target=1;
        System.out.println(Arrays.toString(search(matrix,target)));
    }

    static int[] search(int[][] matrix,int target){
        int row=0;
        int col=matrix.length-1;
        while (row<matrix.length && col >=0)
        {
            if(matrix[row][col]==target)
            {
                return new int[]{row,col};
            }

            if (matrix[row][col]< target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};

    }
}
