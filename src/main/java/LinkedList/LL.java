package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void insertfirst(int data){
        Node nn=new Node(data);
        nn.next=head;
       head=nn;
       if(tail==null){
           tail=head;
       }
       size++;
    }
    public void inserlast(int data){
        if(tail==null){
            insertfirst(data);
            return;
        }
        Node nn=new Node(data);
        tail.next=nn;
        tail=nn;
        size++;
    }
    public void insertmid(int data,int pos){
        if(pos==0){
            insertfirst(data);
            return;
        }
        if(pos==size){
            inserlast(data);
            return;
        }
        int i=1;
        Node temp=head;
        while(i<pos){
            temp=temp.next;
            i++;
        }

//        Node nn=new Node(data,temp.next);
        Node nn=new Node(data);
        nn.next=temp.next;
        temp.next=nn;
        size++;

    }
    public int deletefirst(){
        int val=head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deletelast(){
        Node temp=head;
        int i=0;
        while(i!=size-2){
            temp=temp.next;
            i++;
        }
        int val=tail.data;
        tail=temp;
        tail.next=null;
        size--;
        return val;
    }
    public int deletemid(int pos){
        if(pos==size) {
            return deletelast();
        }
        int i=1;
        Node temp=head;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        int val=temp.next.data;
        temp.next=temp.next.next;
        return val;
    }
    public int find(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return data;// found it
            }
            temp = temp.next;
        }
        return 0; // not found
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}
