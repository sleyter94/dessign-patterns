package edu.excercise.leetcode;

public class DiameterBinaryTree {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        System.out.println(diameterOfBinaryTree(node1));
    }

    private static int response = 0;
    public static int diameterOfBinaryTree(TreeNode root){
        depthBranch(root);
        return response;
    }

    public static int depthBranch(TreeNode node){
        if(node == null) return -1;
        int left = depthBranch(node.left);
        int right = depthBranch(node.right);
        int depth = Math.max(left,right) + 1;
        int diameter = left + right + 2;
        response = Math.max(response,diameter);
        return depth;
    }



}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val = x;}
}