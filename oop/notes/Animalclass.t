public class Driver {
    public static void main(String[] args) {
        
        
    }
}

// Animal is a parent class
class Animal{
    String name;
    String breed;
    int age;
    String color;

    // Animal(){

    // }

    Animal(String name, String breed, int age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;

    }

}

// Dog is a subclass of Animal class
class Dog extends Animal{
    String sniffing;
    Dog(String name, String breed, int age, String color, String sniffing){
        // System.out.println("hi");
        super(name, breed, age, color);
        this.sniffing = sniffing;

    }
}

// Cat is a subclass of Animal class
class Cat extends Animal{
    boolean isOmnivore;
    Cat(String name, String breed, int age, String color){
        // System.out.println("hi");
        super(name, breed, age, color);  
        isOmnivore = true;      

    }
}

// Cow is a subclass of Animal class
class Cow extends Animal{
    int noOfHorns;
    Cow(String name, String breed, int age, String color){
        // System.out.println("hi");
        super(name, breed, age, color);     
        this.noOfHorns = 2;   

    }
}