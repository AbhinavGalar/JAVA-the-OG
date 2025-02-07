// ==============================reverse ==============
 
import java.util.Scanner;

public class Que {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
         int n=1234;
         int orgn=n;
         int digit=0;
         int rv=0;
         
         while(n!=0){
            digit=n%10;
 rv=rv*10+digit;
 n=n/10;
         }
 if(n==orgn){
    System.out.println("pp");
 }

 else{
    System.out.println("ii");
 }      

    
}
    
}

// ================armstrong===========

 int number=2;
 int power=4;
 int result=1;


 for (int i=1; i<=power; ++i){
     result =result*number;
 }
 
 