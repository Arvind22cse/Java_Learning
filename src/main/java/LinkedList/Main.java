package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list =new LL();
        list.insertfirst(10);
        list.insertfirst(20);
        list.insertfirst(30);
        list.inserlast(0);
        list.inserlast(-1);
        list.insertmid(100,3);
        list.display();

        System.out.println(list.deletefirst());
        list.display();
        System.out.println(list.deletelast());
        list.display();
        System.out.println(list.deletemid(2));
        list.display();
        System.out.println(list.find(100));
    }
    }

