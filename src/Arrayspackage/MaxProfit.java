package Arrayspackage;

public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
    }

    public static int checkmaxProfit(int[] prices) {
        int maxPro = 0;
        int minPro = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPro = Math.min(minPro, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - minPro);

        }
        return maxPro;

    }
}
