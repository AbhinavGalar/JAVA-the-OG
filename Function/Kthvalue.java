import java.util.Scanner;
public class Kthvalue {
          
   static void kth(){
      Scanner obj=new Scanner(System.in);
      int arr[]=new int[]{1,2,30,4,5,2};
           int k;
           System.out.println("enter a value");
           k=obj.nextInt();
         for(int i=0; i<arr.length; ++i){
            for(int j=i+1; j<arr.length;++j){
               if(arr[i]<arr[j]){
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp; 
               }
            }
            System.out.print(arr[i]);
         }
          System.out.print(arr[k-1]);
      }

    public static void main(String[] args){

           kth();

    }}


