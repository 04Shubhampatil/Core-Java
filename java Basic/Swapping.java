import java.util.Scanner;

public class Swapping {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    int A, B, temp;
    System.out.print("After Swapping number");
    A = scn.nextInt();
    B = scn.nextInt();

    temp = A;
    A = B;
    B = temp;

    System.out.println("After swapping: A = " + A + ", B = " + B);
    Scanner.scloc();
  }
}
