//package leetcode.dynamicprogramming;
//
//public class Solution_312 {
//    int n;
//    int[][] dp;
//    private int getNumVal(int i, int[] nums){
//        if(i<0 || i>=n)
//            return 1;
//        return nums[i];
//    }
//
//    private int getPairVal(int i, int j){
//        if(i<0 || i>=n || j<0 || j>=n)
//            return 0;
//        return dp[i][j];
//    }
//    public int maxCoins(int[] nums) {
//        n = nums.length;
//        dp = new int[n][n];
//        for(int l=1;l<=n;++l){
//            for(int i=0;i<= n-l;++i){
//                int j= i+l-1;
//                if(l==1){
//                    dp[i][j] = nums[i];
//                    continue;
//                }
//                int max_val = Integer.MIN_VALUE;
//                for(int k=i;k<=j;++k){
//                    max_val = Math.max(max_val, getPairVal(i, k-1)+getPairVal(k+1, j)+ getNumVal(k-1, nums)*
//                            getNumVal(k, nums)* getNumVal(k+1, nums));
//                }
//                dp[i][j] = max_val;
//            }
//        }
//        return dp[0][n-1];
//    }
//}
