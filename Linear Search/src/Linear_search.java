
public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {1,10,15,252,45,47,48,99};
        int target = 99;
        int ans = search(arr, target);
        System.out.println("The element that is found is:"+ans);
    }

    //function for searching the element in the array
    //this function can return the element or the index at which the element is foud
    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return element;
//                return index;
            }

        }
        //this statement gets executed when none of the above statements get executed
//        return -1;    we can use this to return -1 when we return the index of the element because the index of any element can not be -1
        return Integer.MAX_VALUE;//here using this because when we are returning the value of the element
                                // the value can also be -1 so if it returns -1 we can get confused that
                                //if the element is present in the array or not
    }
}