package edu.excercise.leetcode;

import java.util.Stack;

public class MinStack {

    private Element top;

    public static void main(String[] args) {

    }

    public MinStack() {

    }

    public void push(int x) {
        if(top == null){
            top = new Element(x,x);
        }else{
            Element e = new Element(x,Math.min(x,top.min));
            e.next = top;
            top = e;
        }

    }

    public void pop() {
        if(top == null) return;
        Element temp = top.next;
        top.next = null;
        top = temp;
    }

    public int top() {
        if(top==null) return -1;
        return top.value;
    }

    public int getMin() {
        if(top==null) return -1;
        return top.min;
    }
}

class Element{
    public int value;
    public int min;
    public Element next;
    public Element(int value,int min){
        this.value = value;
        this.min = min;
    }
}
