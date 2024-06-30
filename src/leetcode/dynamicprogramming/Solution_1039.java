//package leetcode.dynamicprogramming;
//
//public class Solution_1039 {
//
//    public int minScoreTriangulation(int[] values) {
//
//        int n = values.length;
//        // number of matrices will be n-1
//        int[][] dp = new int[n][n];
//        for(int l=2;l<=n-1;++l){
//            for(int i=1;i<=n-l;++i){
//                int j= i+l-1;
//                dp[i][j] = Integer.MAX_VALUE;
//                for(int k=i;k<j;++k){
//                    dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k+1][j] + values[i-1]*values[k]*values[j]);
//                }
//            }
//        }
//        return dp[1][n-1];
//    }
//}
