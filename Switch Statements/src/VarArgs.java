//This code showcases variable args

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,5,9,5,88,77);
        multiple(5,7,4,"Danish");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a , int b , int c , String ...v){
        System.out.println(Arrays.toString(v));
    }
}
