package Stack;

import Stack.exceptions.StackOverflowException;
import Stack.exceptions.StackUnderflowException;

public class TwoStackInArray {

    private int[] arr;
    private int capacity;
    private int top1, top2;

    public TwoStackInArray(int capacity){
        this.capacity = capacity;
        this.arr = new int[this.capacity];
        top1 = 0;
        top2 = this.capacity-1;
    }

    public void push1(int x){
        if(top1<=top2){
            this.arr[top1] = x;
            top1 += 1;
        }else{
            throw new StackOverflowException();
        }
    }

    public void push2(int x){
        if(top1<=top2){
            this.arr[top2] = x;
            top2 -=1;
        }else{
            throw new StackOverflowException();
        }
    }

    public int pop1(){
        if(top1 ==0){
            throw new StackUnderflowException();
        }
        top1 -=1;
        return this.arr[top1];
    }

    public int pop2(){
        if(top2 ==this.capacity-1){
            throw new StackUnderflowException();
        }
        top2+=1;
        return this.arr[top2];
    }
}
