//Program to print the reverse of a given number taken directly in the input
public class Reverse {
    public static void main(String[] args) {
        int num = 476638;
        int ans = 0;
        while(num>0){
            int rem = num%10;
            num=num/10;
            ans = ans * 10 + rem;
        }
        System.out.print("The reverse of the given number is: "+ans);
    }
}
