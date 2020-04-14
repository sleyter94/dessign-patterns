package edu.excercise.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public static void main(String[] args) {
        int a[] = {0,1};
        System.out.println(findMaxLength(a));
    }

    public static int findMaxLength(int[] nums){
        int max = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<=nums.length-1;i++){
            sum += nums[i] == 0 ? -1:1;
            if(map.containsKey(sum)){
                max = Math.max(max, i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }

    public int findMaxLength2(int[] nums) {
        int sum = 0;
        int max = 0;
        Integer[] map = new Integer[nums.length*2+1];
        map[nums.length] = -1;
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i] == 0 ? nums.length - --sum : nums.length - ++sum;
            if(map[index] != null)
                max = Math.max(max, i- map[index]);
            else
                map[index] = i;
        }
        return max;
    }
}
