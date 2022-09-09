import java.util.Arrays;

class GFG {
    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int num = arr.length;
        fre(arr, num);
    }

        public static void fre(int arr[],int num)
        {
            boolean v[]=new boolean[num];
        for (int i = 0; i < num ; i++)
        {
            if (v[i]==true)
            {
                continue;
            }
            int count=1;
            for (int j = i + 1; j < num;j++ )
            {

                if (arr[i]==arr[j])
                {
                    v[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]);
        }

    }


}