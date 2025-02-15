import java.util.Scanner;

public class Ap {

     public static void main(String[] args) {
            Scanner obj= new Scanner(System.in);
int sum=0;
            int n=5;
            int a=1;
            int d=2;
            for(int i=0;i<n;++i){
                sum=a+i*d;
                System.out.println(sum);
            }
     }
}
