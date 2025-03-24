public class FibonacciUsingABC {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci terms to generate
        int a = 0; // First term
        int b = 1; // Second term
        int c;     // Variable to store the next term


        // Print the first two terms
        System.out.print(a + ", " + b);

        // Loop to calculate the rest of the terms
        for (int i = 3; i <= n; i++) {
            c = a + b; 
            a = b; 
            b = c; 
        }
    }
}
