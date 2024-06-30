package leetcode.dynamicprogramming;

import java.util.*;
public class Solution_1046 {

    public int lastStoneWeight(int[] stones) {

        int n= stones.length;
        if(n==1)
            return stones[0];
        var pq = new PriorityQueue<Integer>((a,b)-> b-a);
        for (int stone : stones) {
            pq.add(stone);
        }
        while(!pq.isEmpty()){
            int w1 = pq.poll();
            if(pq.isEmpty()){
                return w1;
            }
            int w2 = pq.poll();
            if(w1>w2){
                pq.add(w1-w2);
            }
        }
        return 0;
    }
}
