

abstract class Parent{
public Parent(){
        System.out.println("Base class constructor ");
    }
    public void hello(){
        System.out.println("hello");
    }

   abstract public void great();
}

class Chaild extends Parent {

  
    public void great(){
        System.out.println("good morning..");
    }
    
}

 abstract class Chaild2 extends Parent{
    public void th(){
        System.out.println("'i am good '");
    }
}
public class abstrac {
    public static void main(String[] args) {
        Chaild c = new Chaild();
        // Parent p = new Parent();
        c.great();
        
        
    }
    
}
