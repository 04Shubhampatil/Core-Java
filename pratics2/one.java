import java.util.*;

public class one {

	public static void factorial(int n) {

    if(n<0){
    	System.out.println("number is negative");
    	return;
    }

		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		// return fact;
		System.out.print("result is " + fact);


	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter number number:");
		int n = sc.nextInt();
		// int result = factorial(n);
		// System.out.print("result is " + factorial(n));
      factorial(n);
		sc.close();
	}
}