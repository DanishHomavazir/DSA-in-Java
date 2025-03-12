//here we are finding the target element in an infinite array that means that we don't know the end of the array
//so we continuously apply binary search by updating the start and end of the array,
//we search in a particular range of the array and keep on doubling the size of that range until we don't find the target element

public class InfinitreArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9 ,10, 90, 100, 130, 140, 160, 170 };
        int target = 0;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 0;

//        This while loop condition will always ensure that the target lies in between the specified range
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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

