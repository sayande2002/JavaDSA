public class testing {
    String name;
    int id;
    public void eat(){
        System.out.println("EAT");
    }
//    public static void main(String[] args) {
////        testing e1=new testing();
////        int a=e1.id=22;
////        testing e2=new testing();
////        int b=e2.id=23;
////        eat();
////        System.out.println(b);
//
//    }
}
class beta extends testing
{
    public static void main(String[] args) {
        beta c=new beta();
        c.eat();
    }
}
