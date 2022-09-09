package recursion;

public class armstrong {
    public static void main(String[] args) {
        System.out.println(arm(1634));
    }

    public static int arm(int n) {
        if (n % 10 == n) {
            return n*n*n;
        }
        int a=n%10;
        return a*a*a + arm(n / 10);

    }
}
