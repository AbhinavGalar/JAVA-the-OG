import java.util.Scanner;


public class T{
     public static void main(String[] args) {
      System.out.println("enter choice");
        Scanner obj= new Scanner(System.in);
     double temp;
     int choice;
     choice=obj.nextInt();
     System.out.println("enter temprature");
     temp=obj.nextDouble();
 if(choice==1)
 {
   System.out.println("farmheight to celcius");
        temp=((temp*9%5)+32);
        System.out.println(temp);

 }
   if (choice==2){
   System.err.println("celcius to ferr");
   temp =((temp*9%5)-32);
   System.out.println(temp);
 }
    else {
      System.out.println("ii");
    }
}
}
