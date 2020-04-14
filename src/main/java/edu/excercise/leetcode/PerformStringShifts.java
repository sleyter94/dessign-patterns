package edu.excercise.leetcode;

public class PerformStringShifts {

    public static void main(String[] args) {
        String s="abc";
        int move[][] = { {0,1},{1,2} };
        System.out.println(stringShift(s,move));

    }

    public static String stringShift(String s, int[][] shift) {
        int count = 0;
        for(int[] move : shift){
            if(move[0] == 0){
                count -= move[1];
            }else{
                count += move[1];
            }
        }
        if(count>0){
            for(int i=1;i<=count;i++){
                s = s.substring(s.length()-1)+s.substring(0,s.length()-1);
            }
        }else{
            for(int i=1;i<=Math.abs(count);i++){
                s = s.substring(1) + s.substring(0,1);
            }
        }
        return s;


    }
}
