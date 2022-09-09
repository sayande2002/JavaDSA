package recursion;

public class firstinx {

        public static void main(String[] args) {
            int[] a={10,20,30,20,20,40,50};
            System.out.println(arr(a,0,10));
        }

        public static int arr(int []n,int i,int d) {
            if(i==n.length-1){
                return -1;
            }
            int misa=arr(n,i+1,d);
            if(misa==-1){
                if (n[i]==d)
                {
                    return i;
                }
                else {
                    return -1;
                }
            }
            else{
                return misa;
            }
        }
    }

