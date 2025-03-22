public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,14,16,18};
        int target = 4;
        int ans = floor(arr, target);
        System.out.println("The floor of the required num is found at index: "+ans);
    }

    //this method will return the value of the index
    //floor of a num means finding the greatest number that is smaller than or equal to the target element
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
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
        return end; //as the end element of the required half of the array will contain the smallest element than the target
    }
}

