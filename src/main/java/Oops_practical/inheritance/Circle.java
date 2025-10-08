package Oops_practical.inheritance;

public class Circle implements Shape{
    private final int val;
    public Circle(int val){
        this.val=val;
    }
    @Override
    public double area() {
        return 3.14*val*val;
    }

    @Override
    public double perimeter() {
        return 2*3.14*val;
    }
}
