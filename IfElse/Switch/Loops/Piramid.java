import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


                 int a=0;

        

         for(int r=1;r<=9;++r){
            a=(r<=5)?++a:--a;

            for(int c=1;c<=9;++c){

                
                if(c>=6-a && c<=4+a){
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

// row colum normal 

// abd prinyt int colum ab

// ===========print abc in row && print abcd in colum===========

//      creation 

// memory allocate new

/*
 * 
 * 
 * 
 *   declration (4)
 * creation (2)
 * inisalization  (2)
 * retrieval  (2)
 * 
 * 
 * 
 * 
 */
