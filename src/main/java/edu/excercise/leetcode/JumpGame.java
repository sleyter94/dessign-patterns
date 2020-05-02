package edu.excercise.leetcode;

public class JumpGame {

    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        int arr2[] = {3,2,1,0,4};
        System.out.println(canJump(arr));
        System.out.println(canJump(arr2));
    }

    public static boolean canJump(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    public static boolean helper(int[] nums,int start, int end){
        if(start >= end) return true;
        for(int i = start; i<end;i++){
            if(i + nums[i] >= end){
                return helper(nums,start,i);
            }
        }
        return false;
    }
}
