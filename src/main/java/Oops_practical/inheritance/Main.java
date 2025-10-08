package Oops_practical.inheritance;

public class Main {
    public static void main(String[] args) {
        Shape c=new Circle(2);
        Shape r=new Rectangle(12,10);
        Shape s=new Square(13);
        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(s.area());
        System.out.println(r.perimeter());


    }
}
