package leetcode.dynamicprogramming;

import java.util.Arrays;

public class Solution_188 {

    public int maxProfit(int k, int[] prices) {

        int n = prices.length;
        int[] cost = new int[k];
        Arrays.fill(cost, Integer.MAX_VALUE);
        int[] profit = new int[k];
        for (int price : prices) {
            cost[0] = Math.min(cost[0], price);
            profit[0] = Math.max(profit[0], price - cost[0]);
            for (int j = 1; j < k; ++j) {
                cost[j] = Math.min(cost[j], price - profit[j - 1]);
                profit[j] = Math.max(profit[j], price - cost[j]);
            }
        }
        return profit[k-1];
    }
}
