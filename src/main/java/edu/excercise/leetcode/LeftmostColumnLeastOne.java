package edu.excercise.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftmostColumnLeastOne {

    public static void main(String[] args) {
        BinaryMatrix matrix = new BinaryMatrix() {
            private int array[][] = {{0,0},{1,1}};
            @Override
            public int get(int x, int y) {
                return array[x][y];
            }

            @Override
            public List<Integer> dimensions() {
                return Arrays.asList(array.length, array[0].length);
            }
        };
        System.out.println(leftMostColumnWithOne(matrix));
    }

    public static int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> numbers = binaryMatrix.dimensions();
        int n = numbers.get(0);
        int m = numbers.get(1);
        int val = -1;
        for(int i=0;i<n;i++){
            int t = helper(binaryMatrix,i,0,m-1);
            if(t!=-1){
                if(val == -1) val = t;
                else val = Math.min(val,t);
            }
        }
        return val;

    }

    public static int leftMosColumnWithOne(BinaryMatrix binaryMatrix){
        List<Integer> dimen = binaryMatrix.dimensions();
        int m = dimen.get(0), n = dimen.get(1);
        int ans = -1, r = 0, c = n - 1;
        while (r < m && c >= 0) {
            if (binaryMatrix.get(r, c) == 1) {
                ans = c; // record as current ans
                c--;
            } else {
                r++;
            }
        }
        return ans;
    }



    public static int helper(BinaryMatrix binaryMatrix,int row, int start, int end){
        if(start > end) return -1;
        int mid = (start + end)/2;
        if(binaryMatrix.get(row,mid) == 1){
            int other = helper(binaryMatrix,row,start,mid-1);
            if(other == -1) return mid;
            else return other;
        }else{
            return helper(binaryMatrix,row,mid+1,end);
        }
    }
}

interface BinaryMatrix {

    int get(int x,int y);
    List<Integer> dimensions();
}
