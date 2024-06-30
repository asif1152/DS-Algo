//package leetcode.dynamicprogramming;
//
//public class Solution_123 {
//
//    public int maxProfit(int[] prices) {
//
//        int n = prices.length;
//        int[] leftPr = new int[n];
//        leftPr[0] =0;
//        int[] rightPr = new int[n];
//        rightPr[n-1] =0;
//        int leftMin = prices[0];
//        int rightMax = prices[n-1];
//        for(int i =1,j= n-2;i<n;++i,--j){
//            leftPr[i] = Math.max(leftPr[i-1], prices[i]-leftMin);
//            leftMin = Math.min(leftMin, prices[i]);
//            rightPr[j] = Math.max(rightPr[j+1], rightMax-prices[j]);
//            rightMax = Math.max(rightMax, prices[j]);
//        }
//        int maxPr = Integer.MIN_VALUE;
//        for(int i=0;i<n;++i){
//            int rightVal;
//            if(i+1 < n)
//                rightVal = rightPr[i+1];
//            else{
//                rightVal = 0;
//            }
//            maxPr = Math.max(maxPr, leftPr[i]+rightVal);
//        }
//        return maxPr;
//    }
//}
