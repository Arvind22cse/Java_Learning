package Oops_practical.inheritance;

public class Rectangle implements Shape {
    private final int l;
    private final int b;
    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
    @Override
    public double area() {
        return l*b;
    }

    @Override
    public double perimeter() {
        return 2*(l+b);
    }
}
