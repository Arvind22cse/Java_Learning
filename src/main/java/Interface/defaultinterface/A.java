package Interface.defaultinterface;

public interface A {
    static void greeting(){
        System.out.println("Hello from static");
    }
    default void play(){
        System.out.println("I'm playing");
    }
}
