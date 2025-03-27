class Phone {

    public void get() {
        System.out.println("Phone is ringing...");

    }

    public void set() {
        System.out.println("phone is vibrating...");
    }

}

class Square {

    public int calculateArea(int side) {
        return side * side;

    }

    public int parameter(int side) {
        return 4 * side;
    }

}

public class Itsmain {
    public static void main(String[] args) {

        Square side = new Square();
        int result = side.calculateArea(5);
        int parameter = side.parameter(5);
        System.out.println(result);
        System.out.println(parameter);

    }
}