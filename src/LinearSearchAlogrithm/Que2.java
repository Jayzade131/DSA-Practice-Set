package LinearSearchAlogrithm;

public class Que2 {
    public static void main(String[] args) {
       int[][] accounts = {{1,2,3},{3,2,1}};
     int ans=  maximumWealth(accounts);
    }
    static int maximumWealth(int[][] accounts){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {

            int sum=0;
            for (int col = 0; col <accounts[row].length ; col++) {
                    sum+=accounts[row][col];

            }
            if( sum > max)
            {
            max=sum;
            }
        }
        return max;
        }
}
