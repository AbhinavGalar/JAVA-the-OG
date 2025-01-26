import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("enter side of a teriangle");
        Scanner obj=new Scanner(System.in);
        int s1;
        int s2;
        int s3;
s1=obj.nextInt();
s2=obj.nextInt();
s3=obj.nextInt();
  String result;
  result=((s1==s2 && s1==s3)) ? "equiletral":"not";
  System.out.println("result");
    }
}
