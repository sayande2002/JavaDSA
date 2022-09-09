package linkedlist;

public class DLL {
    private Node head;


    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null)
        {
            head.prev=node;
        }
        head=node;
    }
    public void display()
    {
        Node temp=head;
        Node last=null;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            last=temp;
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println("Print in Reverse");
        while (last!=null)
        {
            System.out.println(last.val+"->");
            last=last.prev;
        }
        System.out.print("START");
    }
    public void insertLast(int val)
    {
        Node node=new Node(val);
        Node temp=head;
        node.next=null;

        if(head==null)
        {
            node.prev=null;
            head=node;
            return;
        }
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}
