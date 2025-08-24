package inheritance;

public class Main {
    public static void main(String[] args) {
//        Box obj1=new Box();
//        System.out.println(obj1.l+" "+obj1.h+" "+ obj1.w);
//        Box obj2=new Box(1,2,3);
//        System.out.println(obj2.l+" "+obj2.h+" "+ obj2.w);
//        Box obj3=new Box(obj2);
//        System.out.println(obj3.l+" "+obj3.h+" "+ obj3.w);
//        System.out.println("......................");
//        ChildBox cb1=new ChildBox();
//        System.out.println(cb1.weight);
//        ChildBox cb2=new ChildBox(1,2,3,4);
//        System.out.println(cb2.l+" "+cb2.w+" "+cb2.h+" "+cb2.weight);
//        Box obj4=new ChildBox(1,2,3,4);
//        System.out.println(obj4.w);
        //we can't have child reference variable pointing to parent object
//        ChildBox a=new Box(1,2,3);
//        System.out.println(a.l);
        ChildBox2 obj=new ChildBox2(10,20,20);
        System.out.println(obj.cost);


    }
}
