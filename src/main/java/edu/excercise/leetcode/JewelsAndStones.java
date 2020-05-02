package edu.excercise.leetcode;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {

  public int numJewelsInStones(String J, String S) {
    int result = 0;
    Map<Character, Integer> mapa = new HashMap<>();
    char[] jowels = J.toCharArray();
    for(char jowel : jowels){
      mapa.put(jowel,1);
    }
    char[] stones = S.toCharArray();
    for(char stone : stones){
      if(mapa.containsKey(stone)){
        result++;
      }
    }
    return result;
  }
}
