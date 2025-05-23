//Program to perform calculation operations like +,-,*,/,% on the given two numbers
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;

        while (true){
            System.out.println("Enter the operator:");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op =='*' || op == '/' || op == '%'){
                System.out.print("Enter two numbers on which the operation is to be performed:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if(num2 !=0){
                        ans = num1/num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            }else if (op== 'x'|| op == 'X') {
                break;
            }
            else{
                System.out.println("Invalid operator");
            }
            System.out.println("The answer after performing the "+op+ " operation is: "+ans);
        }
    }
}
