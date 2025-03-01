import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array of primitives
        int[] arr = new int[5];
        arr[0] = 9;
        arr[1] = 91;
        arr[2] = 95;
        arr[3] = 559;
        arr[4] = 649;
        System.out.println(arr[2]);

        //taking the input into the array
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter the value to be appended in the array:");
            arr[i] = sc.nextInt();
        }

        //1st method for printing the elements of the array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        //2nd method for printing the elements of the array
        for(int num : arr){ //for every element in the array, print the element
            System.out.print(num + " "); // here num represents the elements of the array
        }

        //3rd method for printing the elements in the array
        System.out.println(Arrays.toString(arr));

        //array of objects
        String[] str = new String[4];
        for (int i = 0; i <str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modifying the element at position 2 in the str array
        str[2] = "Danish";
        System.out.println(Arrays.toString(str));
    }
}