package Lecture6;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,12,46,5};
        int len = arr.length;
        int temp = arr[len-1];
        int i = len-2;
        while(i >= 0) {
            if(arr[i] > temp) {
                arr[i+1] = arr[i];
            } else {
                break;
            }

            i--;
        }

        // ith data smaller or i = -1
    }
}
