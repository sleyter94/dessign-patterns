package edu.excercise.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

  public int majorityElement(int[] nums){
    Map<Integer, Integer> data = new HashMap<>();
    for(int i : nums){
      data.put(i,data.getOrDefault(i,0) + 1);
      if(data.get(i) > nums.length/2){
        return i;
      }
    }
    return 0;
  }

}
