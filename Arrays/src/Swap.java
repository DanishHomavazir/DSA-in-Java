//Code to swap the numbers that are present at the 2 specified indexes

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9, 12};
        swap (arr,2,4);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int index1, int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
