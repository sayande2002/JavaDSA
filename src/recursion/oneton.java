package recursion;

public class oneton {
    public static void main(String[] args) {
        int sum=fun(5);
        System.out.println(sum);
    }
    static int fun(int n)
    {
        if (n==0)
        {
            return 0;
        }


        return n + fun(n-1);
    }
}
