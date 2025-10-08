package StackandQueue.stack;

public class CustomStack {
    protected int[] data;
    private static final int maxsize=10;
    int ptr=-1;
    public CustomStack(){
        this(maxsize);
    }

    public CustomStack(int size){
        this.data=new int[size];
    }
    public boolean push(int val){
        if(isFull()){
            System.out.println("Stack is full");
        }
        ptr++;
        data[ptr]=val;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        return data[ptr--];
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr==data.length-1;
    }
    private boolean isEmpty(){
        return ptr==-1;
    }



}
