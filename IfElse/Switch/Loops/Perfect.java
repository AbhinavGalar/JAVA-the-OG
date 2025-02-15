import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
   int n=6;
   int sum=0;
   for(int i=1;i<n;++i){
    if(n%i==0){
        sum=sum+1;
    }
   }
    if(sum==n){
        System.out.println("perfect number");
    }

    else {
        System.out.println("ii");
    }
   }
    }

