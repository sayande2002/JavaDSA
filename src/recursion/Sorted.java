package recursion;

import java.util.ArrayList;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2,7, 3, 5, 16, 7};
        int target=7;
        System.out.println(sear(arr, target, 0,new ArrayList<>()));
    }
    static  ArrayList<Integer> sear (int[] arr, int target, int i,  ArrayList<Integer> list)
    {
        if (i==arr.length)
        {
            return list;
        } else if (arr[i]==target) {
            list.add(i);
        }
        return sear(arr,target, i+1, list);


    }
}
