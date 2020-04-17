package edu.excercise.leetcode;

import java.util.Stack;

public class ValidParenthesisString {

    public static void main(String[] args) {
        System.out.println(checkValidString("(*()"));
        System.out.println((int)1.9);
    }

    public static boolean checkValidString(String s){
        Stack<Character> stack = new Stack<>();int i= 0;int left = 0;
        while(i<s.length()){
            char chari =s.charAt(i);
            if(chari == '('){
                stack.push(chari);
            }else if(chari == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else if(left>0){
                    left--;
                }else{
                    stack.push(')');
                    break;
                }
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                    left++;
                }
                left++;
            }
            i++;
        }
        return stack.isEmpty();
    }
}
