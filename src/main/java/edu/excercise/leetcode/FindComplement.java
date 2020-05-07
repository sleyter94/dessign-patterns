package edu.excercise.leetcode;

public class FindComplement {

  public static void main(String[] args) {
    System.out.println(findComplement(5));
  }
  static int findComplement(int num){
    String binary = Integer.toBinaryString(num);
    String response = "";
    for(int i= 0;i<binary.length();i++){
      if(binary.charAt(i) == '1'){
        response = response.concat("0");
      }else{
        response = response.concat("1");
      }
    }
    int res = 0;
    for(int i=0;i<binary.length();i++){
      if(response.charAt(i) == '1'){
        res += Math.pow(2,response.length()-1-i);
      }
    }
    return res;
  }

  
}
