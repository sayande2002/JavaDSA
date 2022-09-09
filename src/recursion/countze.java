package recursion;

public class countze {
    public static void main(String[] args) {
        int n=13033;
        int t=3;
        System.out.println(zero(n,t));
    }
    public static int zero(int n, int t)
    {
        if (n==0)
        {
            return 0;
        }
        int rem1=n%10;
        if (rem1==t)
        {
            return 1+zero(n/10,t);

        }
        return zero(n/10,t);

    }
}
