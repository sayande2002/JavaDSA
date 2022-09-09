package prep;

import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        if (n==0)
        {
            System.out.print(a);
        } else if (n==1) {
            System.out.print(a+" "+b);
        } else if (n>2) {
            System.out.print(a+" "+b);
            int total = 0;

            for (int i = 2; i <  n; ++i) {
                total = a + b;
                System.out.print(" "+total);
                a=b;
                b=total;
            }
        }

    }
}
