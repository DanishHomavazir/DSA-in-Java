//This method searches the required target element in a 2D matrix

import java.util.Arrays;

public class SearchInMatrix{
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(matrix, 5)));
    }

//    This approach has O(n) time complexity so it is not that efficient
    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }

            if(matrix[r][c] < target){
                r++; // moving to the next row directly if the target element is greater than the current element
            }else{
                c--; //moving to the previous column directly if the target element is less than the current element
            }
        }
        return new int[]{-1,-1};
    }
}