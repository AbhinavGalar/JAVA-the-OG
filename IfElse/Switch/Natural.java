import java.util.Scanner;
public class Natural {

     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
int sum=0;
        int n;
        n=obj.nextInt();

        for(int i=1;i<=n;++i){
            sum=sum+i;
            System.out.println(sum);
        }
     }
}

// dynamic bana h =============