import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        //creating an array list of Integers by specifying it otherwise we can leave the 2nd <> empty too
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        //adding elements to the array list
        list.add(255);
        list.add(654);
        list.add(56);
        list.add(21);
        list.add(23);
        list.add(45);
        list.add(653);
        list.add(86);
        list.add(99);
        list.add(542);
        list.add(1);
        list.add(234);

        //printing the array list
        System.out.println(list);

        //removing an element from the array list
        list.remove(2);//removes element based on its index

        //checks if the list contains the specified element or not
        System.out.println(list.contains(1));

        //printing the array list
        System.out.println(list);

        //replacing the 9th index element with 474
        list.set(9,474);


        System.out.println(list.get(3));
        System.out.println(list);
    }
}
