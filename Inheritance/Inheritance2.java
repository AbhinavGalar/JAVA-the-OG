// class One {
//     void Show(){
//         System.out.println("abhinav and drashti are in relationship");
//     }
// } 
 
 
 
 
//  public class Inheritance2 {
//  public static void main(String[] args) {
//     One obj= new One();
//     obj.Show();
//  }
     
//  }


// ==============================MULTIPLE INHERITANCE================
class One {
    void Show(){
        System.out.println("hellu");
    }
}


class Two  extends One{

}

class Three  extends Two  {

}

class Four extends Two  {

}


public class Inheritance2 {

    public static void main(String[] args) {
    //    Three obj = new Three();
    //    obj.Show();

    Four obj = new Four();
    obj.Show();
    }
}
