package recursion;

public class revarr {
    public static void main(String[] args) {
        int[] a={10,200,30,80,40,50};
        System.out.println(arr(a,0));
    }

    public static int arr(int []n,int i) {
        if(i==n.length-1){
            return n[i];
        }
        int misa=arr(n,i+1);
        if (n[i]>misa)
        {
            return n[i];
        }
        else{
            return misa;
        }
    }
}
