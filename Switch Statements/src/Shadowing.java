public class Shadowing {
    static int x = 100; //this will be shadowed at line no 7
    public static void main(String[] args) {
        System.out.println(x); //100
        int x; //the class variable shadowed at line no 2 is this, the value of x is just declared over here
        //System.out.println(x); //the scope only begins when the value is initialized
        x = 40; //the value is initialized over here
        System.out.println(x); //40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
