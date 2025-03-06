// import java.util.Scanner;

// public class Uppercase {
//      static void convestion(String str1)
//      {
//         for(int i=0;i<str1.length();++i){
//  char a=str1.charAt(i);
//    if(str1.charAt(i)>='A' && str1.charAt(i)<='Z'){
//          a=(char) (str1.charAt(i)+32);
//    }
//    else if(str1.charAt(i)>='a' && str1.charAt(i)<='z'){
//     a=(char) (str1.charAt(i)-32);
//    }
//    System.out.print(a);
//         }
//      }
//      public static void main(String[] args) {
//         String input ="My NAME is Rajiv";
//         convestion(input);
     

    
//      }
// }

import java.util.Scanner;
public class Uppercase {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string");
        String input=obj.nextLine();
        for(int i=0;i<input.length();++i){
            char a=input.charAt(i);
            if(input.charAt(i)>='A' && input.charAt(i)<='Z'){
                a=(char) (input.charAt(i)+32);
            }
            else if(input.charAt(i)>='a' && input.charAt(i)<='z'){
                a=(char) (input.charAt(i)-32);
            }
            System.out.print(a);  
    }
    }
}
