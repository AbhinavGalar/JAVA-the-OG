import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);


        int arr[]=new int[]{1,2,3,4};
        int start=0;
        int  end=arr.length-1;
        for(int i=0; i<=arr.length;++i){

          int temp=arr[start];
          arr[start]=arr[end];
          arr[start]=temp;


          start++;
          end--;
        }

        for(int i:arr){
            System.out.println(i);
        }
    }
}
