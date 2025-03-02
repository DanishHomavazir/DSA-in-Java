import java.util.Scanner;
//Program to check the occurrence of a particular integer in a given number
public class Count_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 461667896;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if (rem == 6){
                count++;
            }
            n=n/10;
        }
        System.out.println("The number of 6's in the number is: "+count);
    }
}
