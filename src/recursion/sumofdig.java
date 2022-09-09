package recursion;

public class sumofdig {
    public static void main(String[] args) {
        int sum=fun(505);
        System.out.println(sum);
    }
    static int fun(int n)
    {
        if (n%10==n)
        {
            return n;
        }


        return n%10 * fun(n/10);
    }
}
