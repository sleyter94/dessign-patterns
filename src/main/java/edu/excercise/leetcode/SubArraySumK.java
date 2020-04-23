package edu.excercise.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumK {

    public static void main(String[] args) {
        int a[] = {1,1,1};
        System.out.println(subarraySum(a,2));
    }

    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            if(map.containsKey(sum - k)){
                count += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0) + 1 );
        }
        return count;
    }
}
