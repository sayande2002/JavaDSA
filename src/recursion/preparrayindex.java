package recursion;

public class preparrayindex {
    public static void main(String[] args) {
        int[] arey={10,20,30,20,20,40,50};
        int find=20;
        int [] anew=arr(arey,0,find,0);
        if (anew.length==0)
        {
            System.out.println("Not Found");
            return;
        }
        for (int i = 0; i < anew.length; i++) {
            System.out.print(anew[i]+" ");
        }
    }

    public static int[] arr(int []n,int i,int target,int fsf) {
        if(i==n.length){
            return new int[fsf];
        }
        if (n[i]==target)
        {
            int a[]=arr(n,i+1,target,fsf+1);
            a[fsf]=i;
            return a;
        }
        else {
            int a[]=arr(n,i+1,target,fsf);
            return a;
        }
    }
}
