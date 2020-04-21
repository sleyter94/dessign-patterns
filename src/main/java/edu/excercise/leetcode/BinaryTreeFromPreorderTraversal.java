package edu.excercise.leetcode;

public class BinaryTreeFromPreorderTraversal {

  public static void main(String[] args) {
    int a[] = {8,5,1,7,10,12};
    System.out.println(bstFromPreorder(a));
  }

  public static TreeNode bstFromPreorder(int[] preorder){
    return bstFromPreorder(preorder,0,preorder.length-1);
  }

  static TreeNode bstFromPreorder(int[] preorder,int start,int end){
    if(start>end) return null;
    TreeNode root = new TreeNode(preorder[start]);
    int i;
    for(i=start+1;i<=end;i++){
      if(preorder[i]>root.val) break;
    }
    root.left=bstFromPreorder(preorder,start+1,i-1);
    root.right=bstFromPreorder(preorder,i,end);
    return root;
  }
}



//class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
//}