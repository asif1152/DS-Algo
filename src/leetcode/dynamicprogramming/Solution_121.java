//package leetcode.dynamicprogramming;
//
//public class Solution_121 {
//    public int maxProfit(int[] prices) {
//
//        int n = prices.length;
//        int[] maxVal = new int[n];
//        maxVal[n-1] = prices[n-1];
//        for(int i=n-2;i>=0;--i){
//            maxVal[i] = Math.max(maxVal[i+1], prices[i]);
//        }
//        int maxPr =0;
//        for(int i=0;i<n;++i){
//            if(maxVal[i]<=prices[i])
//                continue;
//            maxPr = Math.max(maxPr, maxVal[i]-prices[i]);
//        }
//        return maxPr;
//    }
//}
