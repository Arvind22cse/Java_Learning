package gendric;

public class Main {
    public static void main(String[] args) {
        costumGenericArrayList<Integer> list=new costumGenericArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.remove());
        System.out.println(list.get(2));
        list.set(3,200);
        System.out.println(list);



    }
}
