class One {
    void display(){
        System.out.println("this is multilevel inhertitance");
    }
}

class Two  extends One {

}

public class Multilevel {
    public static void main(String[] args) {
        Two obj = new Two();
        obj.display();
    }
}
