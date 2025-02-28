public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-5,2,4,6,7,9,10,12,14,18,22};
        int target = 18;
        int ans = binarySearch(arr, target);
        System.out.println("The element is fount at index:"+ans);
    }

//this method will return the value of the index
//if element is not found it will return -1
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find for the middle element
            //int mid = (start + end) / 2 , this might exceed the permissible limit of integer values
            int mid = (start + (end - start) / 2);
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}