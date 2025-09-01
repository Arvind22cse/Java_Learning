package Interface.defaultinterface;

public interface b {
    void greet();
    default void ply(){
        System.out.println("I'm palaying");
    }
}
