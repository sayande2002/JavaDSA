package linkedlist;

public class main {
    public static void main(String[] args) {
        LL list=new LL();
       list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertLast(5);
        list.insert(12,2);
        list.display();
    }
}
