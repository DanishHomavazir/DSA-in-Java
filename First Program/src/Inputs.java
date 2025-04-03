
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//        System.out.print("Enter your roll no: ");
//        int rollno = input.nextInt();
//        System.out.println("Your roll no is:" +rollno);

//        just by writing next it will only print the first word of the sentence not the entire sentence
//        if we write nextLine() while taking the input then it will print the entire line
//        String name = input.next();
//        System.out.println(name);

//        FLOATING POINT ERROR
//        here if we just take float then it doesn't print the entire no given in the input this is known as floating point error
        float no =  input.nextFloat();
        System.out.println(no);
    }
}
