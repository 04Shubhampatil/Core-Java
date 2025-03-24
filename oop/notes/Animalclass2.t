public class Driver {
    public static void main(String[] args) {
        Dog d = new Dog("kalu", "husky", 12, "brown", "perfect");
        d.eat();
        d.walk();
        d.sound();
        System.out.println("xyz = " + d.getXYZ());
        d.security();
    }
}

// Animal is a parent class
class Animal{
    protected String name;
    protected String breed;
    protected int age;
    protected String color;
    private String xyz;

    // Animal(){

    // }

    Animal(String name, String breed, int age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.xyz = "data";

    }

    public String getXYZ(){
        return this.xyz;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void walk(){
        System.out.println("Animal is walking");
    }

    public void sound(){
        System.out.println("Animal is producing sound");
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
    public void security(){
        System.out.println("Dog is working in security as well");
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
    public void popular(){
        System.out.println("Cat is very popular");
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
    public void holy(){
        System.out.println("Cow is holy animal");
    }
}