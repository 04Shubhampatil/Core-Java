class Animals{
    public void eat(){
        System.out.println("this animal eats food");
    }
}

class dog extends Animals{  //!single inheritance  parant of puppy class
    public void bark(){
        System.out.println(" is barking...");
    }

}

class puppy{

}




public class Oops{
    public static void main(String[] args) {
        dog dog1 = new dog();
        dog1.eat();
        dog1.bark();
        
    }
}