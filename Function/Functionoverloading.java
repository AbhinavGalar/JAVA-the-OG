import java.util.Scanner;
public class Functionoverloading {
    static int sum(int a,int b){
        return a+b;
    }

    static double sum(char b,int a){
        return b;
    }
    static int  sum(int b){
        return b;
    }
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum('b',10));
        System.out.println(sum('b',89));

// variable, object,array,
// array direct and array as an object======

        String a="abhinav";
        System.out.println(a);

        // as an object
        String obj= new String("abhay");
        System.out.println(obj);

        // array 
        char arr[]={'a','b','c','d'};
        System.out.println(arr);
    
        // array as an object

        String obj1=new String(arr);
        System.out.println(obj1);
    }

}
