//package leetcode.dynamicprogramming;
//
//import com.sun.source.tree.Tree;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.TreeSet;
//
//public class Solution_2313 {
//
//    class TreeNode {
//        int val;
//        TreeNode left, right;
//        public TreeNode(int val){
//            this.val = val;
//            this.left = this.right = null;
//        }
//        public TreeNode(int val, TreeNode left, TreeNode right){
//            this.val = val;
//            this.right = right;
//            this.left = left;
//        }
//    }
//
//
//    static HashMap<TreeNode, HashMap<Boolean, Integer>> dp = new HashMap<TreeNode, HashMap<Boolean, Integer>>();
//
//    public int findMinOperation(TreeNode root, Boolean result){
//        if(root.left == null && root.right == null){
//            if(!dp.containsKey(root)) {
//                dp.put(root, new HashMap<>());
//            }
//            if(root.val == 1){
//                dp.get(root).put(true, 0);
//                dp.get(root).put(false, 1);
//            }else{
//                dp.get(root).put(false, 0);
//                dp.get(root).put(true, 1);
//            }
//            return dp.get(root).get(result);
//        }
//        if(dp.containsKey(root) && dp.get(root).containsKey(result)){
//            return dp.get(root).get(result);
//        }
//        int ans =0;
//        if(root.val == 2){
//            if (result){
//                ans =  Math.min(findMinOperation(root.left, result), findMinOperation(root.right, result));
//            }else{
//                ans = findMinOperation(root.left, result) + findMinOperation(root.right, result);
//            }
//        }else if(root.val == 3){
//            if(result){
//                ans =  findMinOperation(root.left, result) + findMinOperation(root.right, result);
//            }else{
//                ans = Math.min(findMinOperation(root.left, result), findMinOperation(root.right, result));
//            }
//        }else if(root.val == 4){
//            if(result){
//                ans = Math.min(findMinOperation(root.left, result)+findMinOperation(root.right, !result),
//                        findMinOperation(root.left, !result)+ findMinOperation(root.right, result));
//            }else{
//                ans = Math.min(findMinOperation(root.left, result)+ findMinOperation(root.right, result),
//                        findMinOperation(root.left, !result)+ findMinOperation(root.right, !result));
//            }
//        }else{
//            if(root.left != null){
//                ans = findMinOperation(root.left, !result);
//            }else{
//                ans = findMinOperation(root.right, !result);
//            }
//        }
//
//        if(!dp.containsKey(root)){
//            dp.put(root, new HashMap<>());
//        }
//        dp.get(root).put(result, ans);
//        return ans;
//    }
//
//    public int minimumFlips(TreeNode root, boolean result) {
//        return findMinOperation(root, result);
//    }
//}
