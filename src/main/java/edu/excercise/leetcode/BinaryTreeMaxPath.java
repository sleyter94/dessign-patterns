package edu.excercise.leetcode;

public class BinaryTreeMaxPath {

    private int max = Integer.MIN_VALUE;


    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }

    public int helper(TreeNode node){
        if(node == null) return 0;
        int left = helper(node.left);
        int right = helper(node.right);
        int sum = node.val + Math.max(0,left) + Math.max(0,right);
        max = Math.max(max,sum);
        sum = node.val + Math.max(0, Math.max(left,right));
        return sum;
    }
}
