package gendric;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lamda {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<10;i++){
            al.add(i);
        }
        Consumer<Integer> fun=(arr)-> System.out.println(arr*2);
        al.forEach(fun);
        System.out.println("------------");

    Operation sum=(a,b)->a+b;
    Operation sub=(a,b)->a-b;
    Operation mul=(a,b)->a*b;

    Lamda obj=new Lamda();
        System.out.println(obj.operate(2,3,sum));
        System.out.println(obj.operate(6,4,sub));
        System.out.println(obj.operate(5,5,mul));

    }
    private int operate (int a,int b,Operation op){
        return op.operation(a,b);
    }

}
interface Operation{
    int operation(int a,int b);
}
