import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 41,56},
                {9, 92, 18, 7},
                {20, 30, 40},
                {12, 3},
        };
        int target = 3;
        int[] ans = search(arr,target);//return value of answer = [row][col]
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    //to search for the targeted element in the 2D array
    static int[] search(int[][]arr, int target){
        for(int row=0; row< arr.length;row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col]  == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //to find the maximum value in a 2D array
    static int max(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                if (ints[col] > max) {
                    max = ints[col];
                }
            }
        }
        return max;
    }
}
