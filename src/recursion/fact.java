package recursion;
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        double f=factorial(3,3);
        System.out.println(f);
    }
    public static double factorial (double x, double n) {
        if (n==0)
        {
            return 1.0;
        }
        return x * Math.pow(x,factorial(x,n-1));
    }
}
