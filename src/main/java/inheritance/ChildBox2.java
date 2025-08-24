package inheritance;

public class ChildBox2 extends ChildBox {
    public double cost;

    ChildBox2(double side,double weight,double cost){
        super(side,weight);
        this.cost=cost;
    }

}
