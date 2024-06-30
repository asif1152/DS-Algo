package Stack;

import java.util.Stack;

public class NextGreaterEle {

    public static void findNGE(int arr[], int n){

        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        for(int i=n-1;i>=0;--i){

            while(!st.empty() && st.peek()<= arr[i]){
                st.pop();
            }
            if(st.empty())
                nge[i] = -1;
            else{
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for(int i=0;i<n;++i){
            System.out.printf("%d -> %d\n", arr[i], nge[i]);
        }
    }
}
