import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size as input
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        
        // Declaring the array
        int[] arr = new int[size];

        // Taking array elements as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking the number to search for as input
        System.out.println("Enter the number to search for:");
        int x = sc.nextInt();

        // Searching for the number and printing the index
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                System.out.println("Number " + x + " found at index: " + i);
                found = true;
                break;
            }
        }

        // If the number is not found
        if (!found) {
            System.out.println("Number " + x + " not found in the array.");
        }

        sc.close();
    }
}
