package Stack;

import Stack.exceptions.StackOverflowException;
import Stack.exceptions.StackUnderflowException;

import java.util.Stack;

public class MinStackImpl {

    private final Stack<Integer> minStack;
    private final Stack<Integer> eleStack;
    int capacity;

    public MinStackImpl(int capacity){
        this.capacity = capacity;
        this.eleStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int x){
        if(this.isFull())
            throw new StackOverflowException();
        if(this.getSize() == 0){
            this.minStack.push(x);
            this.eleStack.push(x);
        }else{
            this.eleStack.push(x);
            int topMin = this.minStack.peek();
            this.minStack.push(Math.min(x, topMin));
        }
    }

    public int pop(){
        if(this.getSize() ==0){
            throw new StackUnderflowException();
        }
        int ele = this.eleStack.pop();
        this.minStack.pop();
        return ele;
    }
    public int getMin(){
        if(this.getSize()==0)
            throw new StackUnderflowException();
        return this.minStack.peek();
    }
    public int getSize(){
        return this.eleStack.size();
    }

    public  boolean isFull(){
        return eleStack.size() >= this.capacity;
    }




}
