package polymorphism;

public class Objectclass {
    int n;
    public Objectclass(int n) {
    this.n=n;
    }

    @Override
    public String toString() {
        return "Objectclass{" +
                "n=" + n +
                '}';
    }

    public static void main(String[] args) {
        Objectclass obj=new Objectclass(10);
        System.out.println(obj);

    }
}
