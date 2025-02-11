package LinkedList;

import java.util.Scanner;

class Node{
    private int data;
    private Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + "]";
    }
    
}

class LL{
    private Node head;

    LL(){this.head=null;}

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}


public class LinkedList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL obj = new LL();

        while (true){
            System.out.print("Enter number (-1 to stop): ");
            int data = sc.nextInt();

            if (data==-1){
                break;
            }

            Node newNode = new Node(data);

            if (obj.getHead()==null){
                obj.setHead(newNode);
            }
            else{
                Node temp = obj.getHead();
                while(temp.getNext()!=null){
                    temp=temp.getNext();
                }
                temp.setNext(newNode);
            }
        }
        sc.close();

        //Display LinkedList
        Node curr = obj.getHead();
        while (curr!=null){
            System.out.println(curr);
            curr=curr.getNext();
        }
    }
}