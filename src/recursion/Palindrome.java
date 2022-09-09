package recursion;

public class Palindrome {
    static int palin(int n)
    {
        int digi= (int)(Math.log10(n))+1;
        return rev2(n,digi);
    }
    private static int rev2(int n, int digi)
    {
        if (n%10==n)
        {
            return n;
        }
        int rem= n%10;
        return (int) (rem * (Math.pow(10,digi-1)) + rev2(n/10,digi-1));
    }
    public static void main(String[] args) {
        int a=121;
        int b=palin(121);
        if ( b == a)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
