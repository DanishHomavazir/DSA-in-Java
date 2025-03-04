import java.util.Scanner;
//program to print the number present in the fibonacci series at a specified index
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter the index at which you want to check the fibonacci number: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <=n){
            int temp = b;
            b = a+b;
            a = temp;
            count ++;
        }

        System.out.println("The number at the "+n+" index in the Fibonacci series is: "+b);
    }
}
