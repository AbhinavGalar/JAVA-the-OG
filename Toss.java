import java.util.Scanner;

public class Toss {
    public static void main(String[] args) {
        System.out.println("coin os tossed");
        Scanner obj=new Scanner(System.in);
        int coin1;
        int coin2;
        int coin3;
        int headcount;
coin1=obj.nextInt();
coin2=obj.nextInt();
coin3=obj.nextInt();
headcount=((coin1==1)?1:0 )+((coin2==1)? 1:0) +((coin3==1)? 1:0);
System.out.println(headcount);
    }
}
