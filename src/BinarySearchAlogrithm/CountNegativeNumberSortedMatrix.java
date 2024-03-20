package BinarySearchAlogrithm;

public class CountNegativeNumberSortedMatrix {
    public static void main(String[] args) {
      int[][]  grid = {{4,3,2,-1},
                       {3,2,1,-1},
                       {1,1,-1,-2},
                       {-1,-1,-2,-3}};
        System.out.println(countneg(grid));
    }
    static int countneg(int[][] grid)
    {
        int count=0;
        int trows=grid.length;
        int row=0;
        int col=grid[0].length-1;
        while(row<trows && col>=0)
        {
            if(grid[row][col]>=0)
            {
                row++;
            }
            else{
                count +=trows-row;
                col--;
            }
        }

    return  count;
    }
}
