public class PrimeNSTLoop {

    public static void main(String[] args) {

        for (int n = 2; n <= 10000; n++) {
            boolean isPrime = true; // Reset isPrime for each number

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && n > 1) {
                System.out.println(n + " is a prime number");
            }
           

        }

    }

}
