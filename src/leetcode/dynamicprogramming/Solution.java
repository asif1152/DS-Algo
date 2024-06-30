//package leetcode.dynamicprogramming;
//
//import com.sun.source.tree.Tree;
//
//import java.util.Arrays;
//import java.io.*;
//import java.util.Set;
//import java.util.TreeSet;
//
//// https://www.tutorialspoint.com/Maximum-sum-rectangle-in-a-2D-matrix
//// https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/description/
//
//
//
//public class Solution {
//
//    //static int start, end =0;
//    public int findMaxSumLessThanK(int arr[], int k, int n){
//        int max_sum = Integer.MIN_VALUE;
//        int curSum =0;
//        TreeSet<Integer> preSum = new TreeSet<>();
//        preSum.add(0);
//        for(int i=0;i<n;++i){
//            curSum += arr[i];
//            Integer x = preSum.ceiling(curSum-k);
//            if(x != null)
//                max_sum = Math.max(max_sum, curSum-x);
//            preSum.add(curSum);
//        }
//        return max_sum;
//    }
//
//    public int maxSumSubmatrix(int[][] matrix, int k) {
//
//        int r = matrix.length;
//        int c = matrix[0].length;
//        int tmp[] = new int[r];
//        int max_sum = Integer.MIN_VALUE;
//        //int tr, tc, br, bc;
//        for(int left =0;left<c;++left){
//            Arrays.fill(tmp,0);
//            for(int right =left;  right< c; ++right){
//                for(int i=0;i<r;++i){
//                    tmp[i]+= matrix[i][right];
//                }
//                int max_cur_sum = findMaxSumLessThanK(tmp, k, r);
//                if(max_cur_sum > max_sum){
//                    max_sum = max_cur_sum;
//                }
//            }
//        }
//        return max_sum;
//    }
//}
