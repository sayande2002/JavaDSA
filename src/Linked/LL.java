package Linked;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL()
    {
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){

            this.value=value;
        }
        public Node (int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }

    public void insertfirst(int value)
    {
        Node node =new Node(value);
        node.next=head;
        head=node;
        if (tail==null) {
            tail = head;
        }
        size+=1;
    }

    public void insertlast(int value)
    {
        if (tail==null)
        {
            insertfirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size+=1;

    }

    public void insert(int value,int index) {
        if (index == 0) {
            insertfirst(value);
            return;
        }
        if (index == size)
        {
            insertlast(value);
            return;
        }

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(value, temp.next);
        temp.next=node;
        size+=1;
    }

    public int deleteFirst()
    {
        int value= head.value;
        head=head.next;
        if (head==null)
        {
            tail=null;
        }
        size--;
        return value;

    }
    public void remove()
    {
        head=head.next;
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
        size--;
    }



    public void display(){
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.value+ "->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public Node get(int index)
    {
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;

        }
        return temp;
    }
    public int deletelast ()
    {
        if (size<=1)
        {
            return deleteFirst();
        }

        Node secondLast=get(size-2);
        int value= tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return value;
    }

    public int delete(int index)
    {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deletelast();
        }

        Node prev = get(index - 1);
        int value = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return value;
    }

    public Node find (int value)
    {
        Node node = head;
        while (node !=null)
        {
            if (node.value==value)
            {
                return node;

            }
            node=node.next;
        }
        return null;
    }

    public void deletenode(int digit)
    {
        Node temp=head, prev =null;

        if (temp != null && temp.value == digit) {
            head = temp.next;
            size--;
            display();
            return;
        }

        while (temp!=null && temp.value !=digit)
        {
            prev=temp;
            temp=temp.next;
        }

        if (temp==null)
        {
            System.out.println("Not Present");
            return ;
        }

        prev.next =temp.next;
        size--;
        display();
    }
    public int thesize()
    {
        return size;
    }
}
