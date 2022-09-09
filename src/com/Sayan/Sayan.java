package com.Sayan;

public class Sayan {
    static boolean subarra(int[] arr1, int[] arr2)
    {
        if (arr1.length > arr2.length)
        {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            boolean first= false;
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr2[j] == arr1[i])
                {
                    first=true;
                    break;
                }
            }
            if(first==false)
                return false;


        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[]={1,3,4,5,2};
        int arr2[]={2,4,3,1,7,5,15};
        boolean ans =subarra(arr1, arr2);

        if (ans == true)
            System.out.print("arr1[] is a subset of arr2[]");
        else System.out.print("arr1[] is not a subset of arr2[]");
    }
}
