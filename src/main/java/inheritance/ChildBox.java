package inheritance;

public class ChildBox extends Box{
    double weight;
    ChildBox(){
        this.weight=-1;
    }
    //copy constructer
    //this is same as  Box obj4=new ChildBox(1,2,3,4);
    ChildBox(ChildBox obj){
        super(obj);
        obj.weight=weight;
    }
    ChildBox(double side,double weight){
        super(side);
        this.weight=weight;
    }
    ChildBox(double l,double w,double h,double weight){
        super(l,w,h);//calls the parent class constructor and used to initialise values present in the parent class

        this.weight=weight;
       // if we want to explicitily refer to parent class weight
        System.out.println(super.weight);
//        super(l,w,h); this cant happen because a default super contructor will be called first instead of this.
    }
}
