import java.util.Scanner;

public class Web {
    public static void main(String[] args) {
        System.out.println("enter your website name");
        Scanner obj= new Scanner(System.in);
        String web;
        web =obj.nextLine();
      if(web.equals("www.tourism.com")){
System.out.println("you have two option travel internation or domestic visit");
web =obj.nextLine();
      }
       if (web.equals("internationl")){
        System.out.println("japan or russia");
        web =obj.nextLine();
   
      } 
      if(web.equals("domestic"))
      {
        System.out.println("bhopal and indore");
        web =obj.nextLine();
      }
      else if (web.equals("bhopal"))
      {
        System.out.println("bhopal");
        web =obj.nextLine();
      }
      else if (web.equals("indore"))
      {
        System.out.println("reached");
      }
  else   if(web.equals("international")){
        System.out.println("japan or russian");
        web =obj.nextLine();

      }
    
     else if(web.equals("russia")){
        System.out.println("charge 200");
        web =obj.nextLine();

     }
     else if(web.equals("japan")){
        System.out.println("charge 300");
        web =obj.nextLine();
    
     else  {
        System.out.println("wromng input");
     }
}
}
}
