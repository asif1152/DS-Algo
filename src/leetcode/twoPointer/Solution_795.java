package leetcode.twoPointer;

import java.util.Stack;

public class Solution_795 {

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n = nums.length;
        int[] nextGt = new int[n];
        nextGt[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int j=n-2;j>=0;--j){
            while(!st.isEmpty() && nums[st.peek()] <= nums[j]){
                st.pop();
            }
            if(st.isEmpty()){
                nextGt[j] = -1;
            }else{
                nextGt[j] = st.peek();
            }
            st.push(j);
        }
        int cntSub =0;
        for(int i=0;i<n;++i){
            if(nums[i] < left || nums[i] > right)
                continue;
            int nt = nextGt[i] == -1 ? n-1 : nextGt[i]-1;
            cntSub += (nt-i+1);
        }
        return cntSub;
    }
}
