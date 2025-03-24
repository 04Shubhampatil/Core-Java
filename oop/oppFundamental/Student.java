public class Student{

    // class level : static and non-static

    // non-static or instance variables
    int roll_number;
    String name;
    // static variable
    static String institute = "The Prime Step";

    Student(){
        System.out.println(" \n obj is created");
    }
    void Display(){
        System.out.println("Roll Number: " + roll_number);
        System.out.println("Name: " + name);
        System.out.println("Institute: " + institute);
    }

    Student(int roll_number, String name){
        this.roll_number = roll_number;
        this.name = name;
    }

    
    public static void main(String[] args) {

        Student student1 = new Student(1, "John");
        student1.Display();
       
    }
}