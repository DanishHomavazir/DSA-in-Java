

public class Scope {
    public static void main(String[] args) {
        int a =50;
        int b = 70;
        //Block Scope
        {
           // int a = 55;//cannot be initialized again inside the block
            a = 90;//can be updated over here
        }
        //Loop Scope
        for (int i = 0; i < 5; i++) {
           // int a = 95;//cannot be initialized again inside the for loop
            //int b= 45;//cannot be initialized again inside the for loop
            b = 88;//can be updated over here
            System.out.println(b);
        }
       // System.out.println(i);
    }
    int a = 55;
}
