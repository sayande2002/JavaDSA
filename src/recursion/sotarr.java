package recursion;

public class sotarr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 168};
        System.out.println(sot(arr,0));
    }
    static boolean sot(int [] arr,int i)
    {
        if (i== arr.length-1)
        {
            return true;
        }
        return arr[i]< arr[i+1] && sot(arr,i+1);
    }
}
