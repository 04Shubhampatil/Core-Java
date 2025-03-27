package constructor;
class BCA {
    String StudentfristName;
    String studentlastName;
    int age;
    int id;

    public void printInfo() {
        System.out.println(this.StudentfristName);
        System.out.println(this.studentlastName);
        System.out.println(this.age);
        System.out.println(this.id);
    }

}

public class Batch {
    public static void main(String[] args) {

        BCA student1 = new BCA();
        student1.StudentfristName = "jay";
        student1.studentlastName = "Thakur";
        student1.age = 20;
        student1.id = 1;

        student1.printInfo();

        BCA student2 = new BCA();
        student2.StudentfristName = "vinay";
        student2.studentlastName = "Kumar";
        student2.age = 25;
        student2.id = 2;

        student2.printInfo();

    }
}