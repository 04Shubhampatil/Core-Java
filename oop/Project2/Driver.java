package Project2;

public class Driver {

    public static void print(Dog dog, Cat cat, Cow cow) {
        System.out.println("Dog: " + dog.name + ", " + dog.breed + ", " + dog.age + " years old, " + dog.color
                + ", Sniffing: " + dog.sniffing);
        System.out.println("Cat: " + cat.name + ", " + cat.breed + ", " + cat.age + " years old, " + cat.color
                + ", Omnivore: " + cat.isOmnivore);
        System.out.println("Cow: " + cow.name + ", " + cow.breed + ", " + cow.age + " years old, " + cow.color
                + ", Horns: " + cow.noOfHorns);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("tisan", "desi", 5, "orange/black", "yes");
        Cat cat = new Cat("jymmy", "desi", 1, "black and white");
        Cow cow = new Cow("ganga", "desi", 25, "white");

        print(dog, cat, cow);
    }
}

class Animal {
    String name;
    String breed;
    int age;
    String color;

    Animal(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
}

class Dog extends Animal {
    String sniffing;

    Dog(String name, String breed, int age, String color, String sniffing) {
        super(name, breed, age, color);
        this.sniffing = sniffing;
    }
}

class Cat extends Animal {
    boolean isOmnivore;

    Cat(String name, String breed, int age, String color) {
        super(name, breed, age, color);
        this.isOmnivore = true;
    }
}

class Cow extends Animal {
    int noOfHorns;

    Cow(String name, String breed, int age, String color) {
        super(name, breed, age, color);
        this.noOfHorns = 2;
    }
}
