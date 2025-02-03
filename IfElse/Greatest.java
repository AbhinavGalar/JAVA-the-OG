import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner obj= new Scanner(System.in);
        int num1 ,num2,num3;
        num1=obj.nextInt();
        num2=obj.nextInt();
        num3=obj.nextInt();

        if(num1>=num2){
            System.out.println(num1);
        }
        else if (num2>num3){
           
         System.out.println(num2);
        }
        else if (num3>num1){
            System.out.println(num3);
        }
        else {
            System.out.println("ii");
        }
    }
}
