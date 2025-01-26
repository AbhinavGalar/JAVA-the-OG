import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner obj=new Scanner(System.in);
        int no;
        String result;
no=obj.nextInt();
 result=((no%2==0 && no%4==0 && no%6==0) &&(no%8!=0)) ?"div by 2,4,6" :"not";
 System.out.println(result);
    }
}
