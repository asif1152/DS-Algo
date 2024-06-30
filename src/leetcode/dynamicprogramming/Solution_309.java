//package leetcode.dynamicprogramming;
//
//public class Solution_309 {
//
//    public int maxProfit(int[] prices) {
//        int n = prices.length;
//        int[] sold = new int[n];
//        int[] held = new int[n];
//        int[] rest = new int[n];
//        sold[0] = rest[0] = 0;
//        held[0] = -prices[0];
//        for(int i=1;i<n;++i){
//            sold[i] = Math.max(sold[i-1], held[i-1]+prices[i]);
//            held[i] = Math.max(held[i-1], rest[i-1]-prices[i]);
//            rest[i] = Math.max(rest[i-1], sold[i-1]);
//        }
//        return Math.max(sold[n-1], rest[n-1]);
//    }
//
//}
