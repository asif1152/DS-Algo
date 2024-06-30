package Stack;

import java.util.Stack;

public class MaxSpan {


    public static void calculateSpan(int[] price, int n){

        Stack<Integer> st = new Stack<>();
        int[] span = new int[n];
        for(int i=0;i<n;++i){
            while(!st.empty() && price[st.peek()] <= price[i]){
                st.pop();
            }
            if(st.empty())
                span[i] = i+1;
            else{
                span[i] = i-st.peek();
            }
            st.push(i);
        }
        printPriceSpan(span, n);
    }

    static void printPriceSpan(int[] span, int n){
        for(int i=0;i<n;++i)
            System.out.printf("%d ", span[i]);
        System.out.println();
    }

}
