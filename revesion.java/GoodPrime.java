// import java.util.Scanner;

// public class GoodPrime {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int number = scanner.nextInt();
//     boolean isPrime = true;

//     // Check if the number is prime
//     if (number <= 1) {
//       isPrime = false;
//     } else {
//       for (int i = 2; i <= Math.sqrt(number); i++) {
//         if (number % i == 0) {
//           isPrime = false;
//           break;
//         }
//       }
//     }

//     if (isPrime) {
//       System.out.println(number + " is a prime number.");

//       // Check if it's a "good prime number"
//       if (isGoodPrime(number)) {
//         System.out.println(number + " is also a good prime number.");
//       } else {
//         System.out.println(number + " is not a good prime number.");
//       }
//     } else {
//       System.out.println(number + " is not a prime number.");
//     }

//     scanner.close();
//   }

//   // Logic for "good prime number"
//   public static boolean isGoodPrime(int number) {
//     return number > 10 && number % 10 == 3; // Example: prime greater than 10 and ends with 3
//   }

// }

// Java program to check if a number is prime or not and also if it's a "good prime number"

import java.util.Scanner;

public class GoodPrime {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    boolean isPrime = true;
    boolean isGoodPrime = false;

    // Check if the number is prime
    if (number <= 1) {
      isPrime = false;
    } else {
      for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
          isPrime = false;
          break;
        }
      }
    }

    if (isPrime) {
      System.out.println(number + " is a prime number.");

      // Check if it's a "good prime number"
      if (number > 10 && number % 10 == 3) {
        isGoodPrime = true;
        System.out.println(number + " is also a good prime number.");
      } else {
        System.out.println(number + " is not a good prime number.");
      }
    } else {
      System.out.println(number + " is not a prime number.");
    }

    scanner.close();
  }
}

//Wap to chack if given number if  givin number is ferfect prime 
//perfect prime =(sumof digit ofnumber= prime) 