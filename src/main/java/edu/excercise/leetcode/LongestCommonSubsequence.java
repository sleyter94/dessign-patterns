package edu.excercise.leetcode;

public class LongestCommonSubsequence {



    public int longestCommonSubsequence(String text1, String text2) {
        if(text1 == null || text2 == null || text1.length() == 0 || text2.length() == 0 ){
            return 0;
        }

        char[] cad1 = text1.toCharArray();
        char[] cad2 = text2.toCharArray();
        int m = text1.length();
        int n = text2.length();
        int[][] matrix = new int[m+1][n+1];

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(cad1[i] == cad2[j]){
                    matrix[i][j] = matrix[i-1][j-1]+1;
                }else{
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }
            }
        }
        return matrix[m][n];
    }
}
