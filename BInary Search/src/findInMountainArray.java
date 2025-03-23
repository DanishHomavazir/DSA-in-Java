public class findInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int target = 2;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0 ,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;;
        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find for the middle element
            //int mid = (start + end) / 2 , this might exceed the permissible limit of integer values
            int mid = (start + (end - start) / 2);

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
