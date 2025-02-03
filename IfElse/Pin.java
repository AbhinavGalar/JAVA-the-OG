import java.util.Scanner;

public class Pin {

    public static void main(String[] args) {
           System.out.println("enter your pin");

           Scanner obj =new Scanner(System.in);
       double pin;
       pin=obj.nextDouble();
       if(pin==6261){
        System.out.println("enter your amount");
       }
       else if (pin!=6261){
        System.out.println("wrong pin try again");
       pin=obj.nextDouble();

       } 
         if(pin==6261){
            System.out.println("enter your amount");
         }
         else if(pin!=6261){
            System.out.println("last attempt");
            pin=obj.nextDouble();
       

         }
        
         if(pin==6261){
            System.out.println("enter your amount");
         }

         else if (pin!=6261){
            System.out.println("atm is blocked");
         }
    }
}
