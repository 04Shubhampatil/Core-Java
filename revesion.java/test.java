import java.util.Scanner;

public class test {
    public static void main(String[] arr) {
        int n,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
         n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if(count == 2){
            System.out.println(n+"is prime");
        }
        else{
            System.out.println("no");
        }

    }
}