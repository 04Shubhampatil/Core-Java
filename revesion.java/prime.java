import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
          // wap to chack enter number is prime

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        int n = scanner.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && n > 1) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
        scanner.close();

    }
    
}
