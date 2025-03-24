import java.lang.reflect.Array;
import java.util.Scanner;

public class secondArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length of array");
        int size = sc.nextInt();
        int Array1[] = new int[size];

        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < Array1.length; i++) {

            if (Array1[i] < min) {
                min = Array1[i];
            }

            if (Array1[i] > max) {
              max = Array1[i];
            }

        }

        System.out.println("Max"+max);
        System.out.println("Min"+min);


    }
}
