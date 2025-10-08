package StackandQueue.queue;

public class Customqueue <T>{
    private T[] data;
    private static final int default_size=10;
    int end=-1;
    public Customqueue(){
        this.data = (T[]) new Object[default_size];
    }

    public Customqueue(int size){
        this.data = (T[]) new Object[size];
    }
    public boolean insert(T val) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }

        data[++end]=val;
        return true;
    }
    public T remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        T removed=data[0];
        for(int i=1;i<=end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public T peek () throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public void display(){
        for(int i=0;i<=end;i++){
            System.out.print(data[i]+"-->");
        }
        System.out.println("END");

    }
    public boolean isFull() {
        return end==data.length-1;
    }
    private boolean isEmpty(){
        return end==-1;
    }
}
