import java.util.Scanner;


public class Nested {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int var ;
        System.out.println("enter your choice");
        var =obj.nextInt();
        switch(var){
            case 1 ->
            System.out.println("choose from vegitable");
        var =obj.nextInt();
switch(var){
    case 1->System.out.println("potato");
    case 2->System.out.println("tomato");
}
             case 2->
             System.out.println("choose from fruit");
default ->System.out.println("ii");
        }
    }
}
