import java.util.Scanner;

public class SearchArr {
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        // to search number given array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Search of number in array:");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
        sc.close();
        
    }
    
}
