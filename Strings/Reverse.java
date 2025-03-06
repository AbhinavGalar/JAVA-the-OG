import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
         String input="rajiv";
        //  conver string into array
         char chararray[]= input.toCharArray();
         int start =0;
         int end=chararray.length-1;
         while (start<end) {
             char temp=chararray[start];
             chararray[start]=chararray[end];
             chararray[end]=temp;

             start++;
             end--;


         }
         String obj1=new String(chararray);
         System.out.println(obj1);


         
    }
    // string 
    // convert 
}
