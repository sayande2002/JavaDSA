package Linked;
public class main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertfirst(12);
        list.insertfirst(33);
        list.insertfirst(55);
        list.insertfirst(58);
        list.insertfirst(85);
//        list.insert(23, 2);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        list.remove();
//        list.headt();
//        System.out.println(list.deletelast());
//        System.out.println(list.delete(3));
//        list.display();
//        System.out.println(list.find(5));
        list.display();
        list.deletenode(33);
        System.out.println(list.thesize());
    }
}
