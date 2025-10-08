package StackandQueue.queue;

public class Main {
    public static void main(String[] args) throws Exception {
        Customqueue<String> cq=new Customqueue<>();
        cq.insert("arvi");
        cq.insert("bharath");
        cq.display();
        System.out.println(cq.remove());
        cq.display();

    }
}
