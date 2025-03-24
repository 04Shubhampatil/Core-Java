public class CarDrive {
    public static void main(String[] args) {

        car myCar = new car();
        myCar.name = "Accord";
       car.Engine e = myCar.new Engine();
        e.type = "V8";
        e.printtype();
        e.printmanufacture();
    }

}

class car {
    String name;
    static String company = "honde";

    public void printname() {
        System.out.println("Car name: " + name);
    }

    public static void printcompany() {
        System.out.println("Company: " + company);

    }
    //^inner class/nester method
    class Engine {
        String type;
        static String manufacture = "ABC";

        public void printtype() {
            System.out.println("Engine type: " + type);
        }

        public static void printmanufacture() {
            System.out.println("Manufacture: " + manufacture);
        }
    }
}