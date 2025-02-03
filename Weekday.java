import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner obj= new Scanner(System.in);
        int num;
        num=obj.nextInt();

        if(num==1){
            System.out.println("monday");
        }
        else if (num==2){
            System.out.println("tuesday");
        }
        else if (num==3){
            System.out.println("wednessday");
        }
        else if (num==4){
            System.out.println("thrusday");
        }
        else if (num==5){
            System.out.println("friday");
        } else if (num==6){
            System.out.println("saturday");
        }

      else {
        System.out.println("ii");
      }
    }
}
