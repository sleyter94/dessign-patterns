package edu.excercise.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args) {
        int[] ex = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(ex));
    }

    public static int lastStoneWeight(int[] stones){
        if(stones.length == 0) return 0;
        if(stones.length == 1) return stones[0];
        PriorityQueue<Integer> queue = new PriorityQueue<>(stones.length, (o1, o2) -> o2.compareTo(o1));
        for(int i = stones.length-1;i>=0;i--){
            queue.add(stones[i]);
        }
        while(queue.size() > 1){
            Integer ele1 = queue.poll();
            Integer ele2 = queue.poll();
            if(ele1 != ele2){
                queue.add(ele1 - ele2);
            }
        }
        if(queue.size() > 0)
            return queue.peek();
        else
            return 0;

    }
}
