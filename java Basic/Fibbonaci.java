import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        // int n = 10;
        // int a = 0;
        // int b = 1;
        // System.out.println("Fibonacci series of " + n + " numbers:");
        // for (int i = 1; i <= n; i++) {
        // System.out.print(a + " ");
        // int sum = a + b;
        // a = b;
        // b = sum;

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scn.nextInt();
        System.out.println("Fibonacci series of " + n + " numbers:");
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(a + " ");

        }
        scn.close();


    }
}
