// inheritance = property inhert parent class 
// private or constructor

// 1st = single inheritance
// 2nd=multiple inheritance
// 3rd= hirerachy inheritance

// ********************diamond problrm=================
// 4th= multilevel inheritance
// 5th= hybrid inheritance

//  class One{   
//  void show(){
//     System.out.println("abddd");
//  }
//  }
//  class Two extends One{

//  }

//     class Three extends Two{
    
//     }

// public class Inheritance1 {
// public static void main(String[] args) {
//     One obj=new One();
//     obj.show();
// }
    
// }
// inheritance = is a  relationship (tight copling )  (modification in parent reflects in child)
// association = has a relationship (loose coupling )    (modification in parent does not effect child) ()

// class Two{
//     int a;
//     void Show(){
//         System.out.println("hello");
//     }
// }
// public class One extends Two {

//     public static void main(String[] args) {
//         Two obj= new Two();
//         obj.Show();
//     }
// }
// loose coupling autowireing 


 class One {
      void display(){
        System.out.println("this is inheritance");
      }
 }


 class Two extends One {

 }



 class Three extends Two {
    public static void main(String[] args) {
        Three obj = new Three();
        obj.display(); 
 }
}

public class s {

    
}
 