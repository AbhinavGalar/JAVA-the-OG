import java.util.Scanner;

public class Gp {

     public static void main(String[] args) {
            Scanner obj= new Scanner(System.in);
        
          double  sum=1;
          double  a=1;
          double   r=3;
            double n=5;
        
        for(int i=0;i<n;++i){
            sum=a*(int)Math.pow(r,i);

                
        }
        System.out.println(sum);
        
        
        }
    }