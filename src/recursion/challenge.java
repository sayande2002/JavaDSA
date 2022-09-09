package recursion;

import java.util.ArrayList;

public class challenge {
    public static void main(String[] args) {
        int[] a={1,3,4,5,3,3,3,5,7};
        int target=3;
        System.out.println(chal(a,0,5,new ArrayList<>()));
    }
    static ArrayList<Integer> chal(int [] a,int i, int target,ArrayList<Integer> list)
    {
        if (i==a.length)
        {
            return list;
        }
        if (a[i]==target)
        {
            list.add(i);
        }

        return chal(a, i+1,target,list);

    }
}
