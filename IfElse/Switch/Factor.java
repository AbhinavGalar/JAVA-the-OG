import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int f;
       f=obj.nextInt();
       for(int i=1;i<=f;++i){
        if(f%i==0){
            System.out.println(i);
        }
       }
    }
}
