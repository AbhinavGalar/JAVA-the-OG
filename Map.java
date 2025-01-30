import java.util.Scanner;


public class Map {
    public static void main(String[] args) {
        System.out.println("enter your path");
        Scanner obj= new Scanner(System.in);
        int path;
        path= obj.nextInt();

        if (path==1){
            System.out.println("you have many route 1 ,2 ,3 and 4");
            path= obj.nextInt();
            if(path==4){
                System.out.println("reached destiny");
            }
            if(path==3){
                System.out.println("enter 4");
        path= obj.nextInt();
if(path==4){
    System.out.println("reached");
}
            }
        }

      
        if(path ==2){
            System.out.println("you have only pne path 3");
        path= obj.nextInt();

        }
        if(path==3){
            System.out.println("shorted path is 4");
        path= obj.nextInt();
        }
        if (path==4){
            System.out.println("you reached at your destination ");
        }
        else {
            System.out.println("you entered in a wrong path");
        }
    }
}
