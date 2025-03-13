//import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        TYPECASTING
//        int num = (int)(99.999f);
//        System.out.println(num);

//        Automatic type promotion expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b);
//
//        byte a = 50;
//        byte b = 40;
//        byte c = 100;
//        int d = a*b / c;  //here the output is 20 so when it multiplies 50*40 the answer is 2000
                            //which is way above the value that the byte operator can take
                            // so in java the data type is already changed to int while doing this calculation
                            //this is the automatic type conversion that takes place
//        System.out.println(d);

//        int num = 'A';//will print the ascii value of A
//        System.out.println(num);

        // Example for entire type conversion
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i / c) - (d*s);
        //automatic type conversion takes place and the output of the conversions will be as follows
        // float + int - double = double, everything will be converted to double as it is the largest data type amongst all
        System.out.println((f*b) + " " + (i / c) +" " +  (d*s));
        System.out.println(result);
    }
}
