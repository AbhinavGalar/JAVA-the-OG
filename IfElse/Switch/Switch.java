import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner obj = new Scanner(System.in);
        int a=1;
        a=obj.nextInt();
        switch(a){
            case 1->System.out.println("case1");



            case 2-> System.out.println("case2");
            default->System.out.println("ii");
        }
        
    }
}
