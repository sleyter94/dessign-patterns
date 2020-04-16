package edu.excercise.leetcode;

public class ProductArrayExceptSelf {

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = productExceptSelf(a);
        for(int b1 : b){
            System.out.println(b1);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int response[] = new int[nums.length];
        response[0] = 1;
        for(int i=0;i<nums.length-1;i++){
            response[i+1]=response[i]*nums[i];
        }
        int left=1;
        for(int i=nums.length-1;i>0;i--){
            response[i-1] *= nums[i]*left;
            left = left*nums[i];
        }
        return response;

    }
}
