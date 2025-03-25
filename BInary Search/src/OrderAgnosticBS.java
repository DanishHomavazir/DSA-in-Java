//The order agnostic binary search is a type of binary search in which we first check the order of sorting and accordingly apply the binary search algorithm on it.
//By order of sorting we mean whether it is sorted in the ascending or descending order
public class OrderAgnosticBS {
    public static void main(String[] args) {
//        for ascending order search
//        int[] arr = {-5,2,4,6,7,9,10,12,14,18,22};
//        int target = 18;

//        for descending order search
        int[] arr =  {99,75,60,40,22,18,10,5};
        int target = 10;
        int ans = orderAgnosticBS(arr,target);
        System.out.println("The element is found at index : "+ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
