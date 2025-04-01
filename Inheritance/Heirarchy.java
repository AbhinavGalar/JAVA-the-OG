class One {
    void display(){
        System.out.println("this is hierarchical inheritance");
    }
}

class Two  extends One  {

}

class Three extends Two {

}

class Four extends Three {

}

public class Heirarchy {
    public static void main(String[] args) {
        Four obj = new Four();
        obj.display();
    }
}

// inheritance = 
// privale class or constructor ko nhi inherit karta h 
