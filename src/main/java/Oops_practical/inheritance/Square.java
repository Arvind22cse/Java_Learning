package Oops_practical.inheritance;

public class Square implements Shape{
    private final int a;
    public Square(int a) {
        this.a=a;
    }

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return 4*a;
    }
}
