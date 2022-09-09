package cyclicsort;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        cycle(a);
        System.out.println(Arrays.toString(a));
    }
    static void cycle(int []a)
    {
        int i=0;
        while(i<a.length)
        {
            int correct=a[i]-1;
            if (a[i]!=a[correct])
            {
                swap(a,i,correct);
            }
            else {
                i++;
            }

        }

    }
    static void swap (int[] a,int i,int b)
    {
        int temp=a[i];
        a[i]=a[b];
        a[b]=temp;
    }
}
