import java.util.Scanner;

public class Dick {
    public static void main(String[] args) {
        System.out.println("enter your word");
        Scanner obj= new Scanner(System.in);
        String word1;
        String word2;
        String word3;


     word1=obj.nextLine();
     System.out.println("enter your 2 word");
   
     word2=obj.nextLine();
     System.out.println("enter your 3 word");

     word3=obj.nextLine();

if(word1.compareTo(word2)>0){
    String temp=word1;
    word1=word2;
    word2=temp;
}
if(word1.compareTo(word3)>0){
    String temp=word2;
    word2=word3;
    word3=temp;
}
if(word2.compareTo(word3)>0){
String temp=word2;
word2=word3;
word3=temp;
}

System.out.println(word1+" "+word2+" "+word3);

    }
}