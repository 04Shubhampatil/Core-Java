public class Automorphic {
    public static void main(String[] args) {
        int number = 625; // You can change this number to test other values
        int square = number * number; // Calculate the square of the number

        // Convert both the number and its square to strings
        String strNumber = Integer.toString(number);
        String strSquare = Integer.toString(square);

        // Check if the square ends with the number
        if (strSquare.endsWith(strNumber)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
    }
}
