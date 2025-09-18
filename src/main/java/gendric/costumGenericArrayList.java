package gendric;

import java.util.List;

public class costumGenericArrayList <T extends Number>{
    private Object[] arr;
    int maxsize=10;
    int length=0;
    public costumGenericArrayList(){
        arr=new Object[maxsize];
    }
    public void add(T val){
        if(length==maxsize-1){
            resize();
        }
        arr[length]=val;
        length++;
    }

    public void resize(){
        Object[] temp=new Object[maxsize*2];
        for(int i=0;i<length;i++){
            temp[i]= (int) arr[i];
        }
        arr=temp;
    }
  public T remove(){
      return (T)(arr[--length]);
  }
  public T get(int index){
        return (T)(arr[index]);
  }
  public int size(){
        return length;
  }
  public void set(int index, T value){
    arr[index]=value;

  }
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<length;i++){
            if(i==length-1){
                sb.append(arr[i]);
            }
            else sb.append(arr[i]).append(",");
        }
        sb.append("]");
      return sb.toString();
    }
}
