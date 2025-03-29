//This code explains the various methods that are present for printing the elements in a 2D array

import java.util.Arrays;
import java.util.Scanner;

public class Multi_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];//creating a 2D array

        //taking input in the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //1st method for printing the 2D array
        //the basic method
        for (int row = 0 ; row<arr.length; row++){
            for (int col = 0 ; col< arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(" ");
        }

        //2nd method for printing the 2D array
        // enhanced for loop method (for-each loop method)
        for (int[] a : arr ){
            System.out.println(Arrays.toString(a));
        }

        //3rd method for printing the 2D array
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
