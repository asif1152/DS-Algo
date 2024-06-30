//package leetcode.dynamicprogramming;
//
//public class Solution_375 {
//
//    int[][] dp;
//    private int getPairVal(int i, int j, int n){
//        if(i>=0 && i<=n && j>=0 && j<= n){
//            return dp[i][j];
//        }
//        return 0;
//    }
//
//    public int getMoneyAmount(int n) {
//        dp = new int[n+1][n+1];
//        for(int l=2;l<=n;++l){
//            for(int i=1;i<=n-l+1;++i){
//                int j = i+l-1;
//                int min_res = Integer.MAX_VALUE;
//                for(int k=i;k<=j;++k){
//                    min_res = Math.min(min_res, k + Math.max(getPairVal(i, k-1,n), getPairVal(k+1, j, n)));
//                }
//                dp[i][j] = min_res;
//            }
//        }
//        return dp[1][n];
//    }
//}
