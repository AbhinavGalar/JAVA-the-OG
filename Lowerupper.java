import java.util.Scanner;

public class Lowerupper {
    public static void main(String[] args) {
        System.out.println("enter your character");
        Scanner obj=new Scanner(System.in);
        char a;
        a=obj.nextLine().charAt(0);
        if(a>='A' && a<='Z'){
            System.out.println((char)(a+32));
        }
        else {
            System.out.println((char)(a-32));
        }
    }
}
