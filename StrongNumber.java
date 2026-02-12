import java.util.Scanner;

public class StrongNumber {

    // Function to calculate factorial of a digit
    static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if a number is a Strong Number
    static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is NOT a Strong Number.");
        }
    }
}
