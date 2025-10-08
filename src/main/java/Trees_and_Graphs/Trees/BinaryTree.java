package Trees_and_Graphs.Trees;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }
    private static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    private Node root;
    public void populate(Scanner sc){
        System.out.println("Enter the root node: ");
        int val=sc.nextInt();
        root= new Node(val);
        populate(sc,root);
    }
    public void populate(Scanner sc,Node node){
        System.out.println("Do you want the left node");
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter the left node of "+node.val);
            int val=sc.nextInt();
            node.left=new Node(val);
            populate(sc,node.left);
        }
        System.out.println("Do you want the right node");
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("Enter the right node of "+node.val);
            int val=sc.nextInt();
            node.right=new Node(val);
            populate(sc,node.right);
        }

    }
    public void display(){
        display(root,"");
    }
    public void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.val);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        tree.populate(t);
        tree.display();
    }
}
