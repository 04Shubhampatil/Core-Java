import java.util.Scanner;

public class fristarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length of array");
        int size = sc.nextInt();
        int Array1[] = new int[size];

        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = sc.nextInt();
        }

        for (int i = 0; i < Array1.length; i++) {
            System.out.println("Array" + (i + 1) + "is" + Array1[i]);
        }

    }
}

