package StackandQueue.Stack;

public class Dynamicstack extends CustomStack{
    public Dynamicstack(){
        super();
    }
    public Dynamicstack(int size){
        super(size);
    }

    @Override
    public boolean push(int val) {
        if(this.isFull()){
            int[] temp=new int[data.length*2];

            for(int i=0;i< data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        //at this point we know that data is not full, and it's double the size
        return super.push(val);

    }
}
