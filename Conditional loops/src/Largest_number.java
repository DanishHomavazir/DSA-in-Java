import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();
        System.out.println("Enter the third number");
        int c = in.nextInt();

//        int max = a;
//
//        if(b>a){
//            max = b;
//        }
//
//        if (c>a){
//            max = c;
//        }
//
        int max= Math.max(c,Math.max(a ,b)); //inbuilt math function to find the largest among the variables that are specified

        System.out.println("The maximum amongst the three is: "+max);
    }
}
