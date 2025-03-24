import java.util.*;



public class one{

   public static int mul(int a,int b){
      
   	return  a*b;
}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter two number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		// int mul = Sum(a,b);

		System.out.print("multiplication of two numbers :" + mul(a,b));
		sc.close();
	}
}