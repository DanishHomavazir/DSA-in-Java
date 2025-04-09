
import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the bike brand");
        String brand = input.next();

        switch (brand) {
            case "Triumph" -> System.out.println("The three cylinder king");
            case "Ducati" -> System.out.println("Italian beast");
            case "Kawasaki" -> System.out.println("Inline 4 symphony");
            case "BMW" -> System.out.println("The best in the business!! Make Life a Ride");
            default -> System.out.println("Please enter a valid input");
        }

        System.out.println("Enter the no of the day of the week");
        int no = input.nextInt();

        //Enhanced switch case statement
//        switch(no){
//            case 1,2,3,4,5 -> System.out.println("Weekday");
//            case 6,7 -> System.out.println("Weekend");

        //In the normal syntax of the switch case statement
        switch (no) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }
    }
}

