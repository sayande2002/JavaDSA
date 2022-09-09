package recursion;

public class Palin {
    public static void main (String[] args)
    {
        int n = 1221;
        int sum = rev(n,0);

        if (sum== n)
            System.out.println("yes");
        else
            System.out.println("no" );
    }
    static int rev(int n,int sum )
    {
        if (n==0)
        {
            return sum;
        }
        int rem=n%10;
        sum= sum *10+rem;
        return rev (n/10, sum);
    }
}
