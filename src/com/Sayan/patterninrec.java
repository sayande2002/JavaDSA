package com.Sayan;

public class patterninrec {
    public static void main(String[] args) {
        fun10(4,0);
    }

    public static void fun10(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            System.out.print("*");
            fun10(r, c + 1);
        }
        else {
            System.out.println();
            fun10(r-1, 0);
        }

    }
}
