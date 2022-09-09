package prepcoding.recursion;

import java.util.ArrayList;

public class subseq {
    public static void main(String[] args)
    {
        ArrayList<String>pes=res("abc");
        System.out.println(pes);
    }
    static ArrayList<String> res (String a)
    {
        if(a.length()==0){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch=a.charAt(0);
        String s=a.substring(1);
        ArrayList<String> ar = res(s);

        ArrayList<String> newar=new ArrayList<>();
        for (String i :ar) {
            newar.add(""+i);
        }
        for (String i :ar) {
            newar.add(ch + i);
        }
        return newar;
    }
}
