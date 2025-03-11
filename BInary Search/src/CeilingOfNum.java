public class CeilingOfNum {
    public static void main(String[] args) {
    int[] arr = {2,3,5,7,9,14,16,18};
    int target = 19;
    int ans = ceiling(arr, target);
    System.out.println("The ceiling of the required num is fount at index: "+ans);
}

    //this method will return the value of the index
    //ceiling of a num means finding the smallest number that is greater than or equal to the target element
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length - 1]){
            return  -1;
        }

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
        return start; //as when the loop will end start will be > end which will be the expected answer
    }
}
