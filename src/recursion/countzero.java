package recursion;
import java.util.*;
public class countzero {
    public static void main (String[] args)
    {
        int n = 10900;
        int m=9;

        System.out.println(cal(n,m));

    }
    static double cal(int n, int m)
    {
        if (n==0)
        {
            return 0;
        }
        int rem=n%10;
        if (rem==m)
        {
            return 1+ cal(n/10,m);
        }
        return cal (n/10, m);
    }
}
