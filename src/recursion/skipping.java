package recursion;

public class skipping {
    public static void main(String[] args) {
        skip("","bachaa");
        System.out.println(skipApple("sayanAppede"));
    }
    public static void skip(String p,String s)
    {
        if (s.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=s.charAt(0);
        if (ch=='a')
        {
            skip(p,s.substring(1));
        }
        else {
            skip(p+ch,s.substring(1));
        }
    }
    public static String skipApple(String s)
    {
        if (s.isEmpty())
        {
            return "";
        }
        if (s.startsWith("App") && !s.startsWith("Apple"))
        {
            return skipApple(s.substring(3));
        }

        else {
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }
}
