import java.util.Scanner;

public class Coini {
    public static void main(String[] args) {
        System.out.println("the coin is tossed");
        Scanner obj=new Scanner (System.in);
        int coin1;
        int coin2;
        int coin3;
        int headcount=2;
        coin1=obj.nextInt();
        coin2=obj.nextInt();
        coin3=obj.nextInt();
  if( coin1==coin2 || coin2==coin3 || coin3==1){
System.out.println( heads);
  }
  else {
    System.out.println("tails");
  }
}
}
