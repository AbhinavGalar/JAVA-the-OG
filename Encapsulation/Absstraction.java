// abstraction means hiding  data 
// hiding data ()

// abstract class a object  nhi banta 

   abstract class One {
    abstract void on();
    abstract void off();
}

class Two  extends One {
void on(){
    System.out.println("tv is onn");
}

void off(){
    System.out.println("tv is onn");
}
public static void main(String[] args) {
    
}
}






// condition for abstraction 
// class abstracted (1 or more abstract function)
// abstract function = abstract keyword (it does not have implimantation)
// implementation is nessecary in inherit class otherwise class is abstracted 