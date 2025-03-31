//Program to find the minimum value in the array using linear search

public class FindMinInString {
    public static void main(String[] args) {
        int[] arr = {19,12,7,3,14};
        System.out.println(min(arr));
    }

    //assuming that the array is not empty
    //return the minimum value present in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
