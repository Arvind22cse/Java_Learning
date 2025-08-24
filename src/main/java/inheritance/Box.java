package inheritance;

public class Box {
    double l;
//    private double l; when it is private it can be accessed only in that class alone
    double w;
    double h;
   double weight=10;
   double side;
    Box() {
        this.l = -1;
        this.h=-1;
        this.w=-1;
    }
    Box(double side){
        this.side=side;
    }
    Box(double l,double w,double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    Box(Box obj){
        this.l=obj.l;
        this.w=obj.w;
        this.h=obj.h;
    }
}
