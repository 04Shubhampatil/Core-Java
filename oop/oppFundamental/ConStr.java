public class ConStr {

  class Student{
    String name;
    int age;

    public void Info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

  }

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "John";
    s1.age = 20;
    s1.Info(); // constructor called here
  }
    
}
