import java.util.Scanner;

public class funOne {

	public static void Count(int base,int pow){

		double res=Math.pow(base,pow);
		System.out.println(res);
		
    }
		

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eneter a base");
        int base = scanner.nextInt();
          System.out.println("eneter a power");

        int pow = scanner.nextInt();

        Count(base,pow);

        // int res = vote(age);
        // System.out.println("  " + " "+ res);
        scanner.close();


    }

}
