//package leetcode.dynamicprogramming;
//
//public class Solution_673 {
//
//    public int findNumberOfLIS(int[] nums) {
//        int n = nums.length;
//        int[] ways = new int[n];
//        int[] cntSub = new int[n];
//        int max_val, cnt ;
//        max_val =0; cnt =0;
//        for(int i=0;i<n;++i){
//            ways[i] =1;
//            cntSub[i] = 1;
//            if(ways[i] > max_val){
//                max_val = ways[i];
//                cnt = 1;
//            }else if(ways[i] == max_val){
//                cnt += 1;
//            }
//            for(int j=i-1;j>=0;--j
//                if(nums[i] > nums[j]){
//                    boolean update = false;
//                    if(ways[i] <= ways[j]+1)
//                        update = true;
//                    if (ways[i] < ways[j]+1){
//                        ways[i] = ways[j]+1;
//                        cntSub[i] = cntSub[j];
//                    }else if (ways[i] == ways[j]+1){
//                        cntSub[i] += cntSub[j];
//                    }
//                    if(ways[i]> max_val){
//                        max_val = ways[i];
//                        cnt = cntSub[i];
//                   } else if (ways[i] == max_val && update){
//                        cnt += cntSub[i];
//                    }
//                }
//            }
//        }
//        return cnt;
//    }
//}
