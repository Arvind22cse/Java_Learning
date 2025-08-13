package Singleton;

public class Singleton {

    String name;
    private Singleton() {
        System.out.println("obj created");
        this.name="Arvind";
    }

    @Override
    public String toString() {
        return name;
    }

    static Singleton instance;

    public static Singleton getInstance() {
        if(instance==null) {
            instance = new Singleton();
        }
        return instance;

    }

}
