import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        System.out.println("enter side of triangle");
        Scanner obj=new Scanner(System.in);
        int side1;
        int side2;
        int side3;
side1=obj.nextInt();
side2=obj.nextInt();
side3=obj.nextInt();

if(side1==side2){
System.out.println("eqiletral");
}
else{
System.out.println("invailid triangle");
}

    }
}
