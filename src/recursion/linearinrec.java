package recursion;

public class linearinrec {
    public static void main(String[] args) {
        int[] a={3,2,1,18,9};
        int target=2;
        boolean b=recu(a,target, 0);
        System.out.println(b);
    }
    static boolean recu(int[] a,int target,int i) {

            if (i== a.length) {
                return false;
            }

            return a[i]==target || recu(a, target, i + 1);

        }

    }

