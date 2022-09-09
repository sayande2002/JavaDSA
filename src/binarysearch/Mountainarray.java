package binarysearch;

public class Mountainarray {
    public static void main(String[] args) {
        int[] arr = {0,10,15,2};
        int start =0;
        int end = arr.length-1;
        System.out.println(searching(arr,start, end));
    }
    public static int searching (int [] arr, int start, int end) {

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
