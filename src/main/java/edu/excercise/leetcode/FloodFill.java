package edu.excercise.leetcode;

public class FloodFill {

  public static void main(String[] args) {
    int[][] arr = {{0,0,0},{0,1,1}};
    floodFill(arr,1,1,1);
  }

  public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int SP = image[sr][sc];
    if(SP != newColor)
      dp(image,sr,sc,newColor,SP);
    return image;
  }

  public static void dp(int[][] image,int row,int column,int newColor, int sp){
    if(row>=0 && row<image.length && column>=0 && column<image[0].length && sp == image[row][column]){
      image[row][column] = newColor;
      dp(image,row+1,column,newColor,sp);
      dp(image,row-1,column,newColor,sp);
      dp(image,row,column+1,newColor,sp);
      dp(image,row,column-1,newColor,sp);
    }
  }
}
