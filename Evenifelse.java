import java.util.Scanner;

public class Evenifelse {
   public static void main(String[] args) {
    System.out.println("enter your number");
    Scanner obj= new Scanner(System.in);
    int num;
num=obj.nextInt();

if((num%2==0 && num%4==0 && num%6==0)&& (num%8!=0)) {
    System.out.println("divisible by 2,4,6");
}

else {
   System.out.println("invailid input ");
}
   
}
}
