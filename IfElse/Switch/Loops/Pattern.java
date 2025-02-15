import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

         for(int r=1;r<=5;++r){
            for(int c=1;c<=9;++c){


                if(c>=6-r  && c<=4+r){
                    System.out.print("*");
                }


                else {
                    System.out.print(" ");
            }

                       
            }

            System.out.println();
         }


        //  praimid pattern


        // 

}
}

