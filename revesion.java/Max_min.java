        // WAP to find maximum and minimum number entered from user using loop without array.
        import java.util.Scanner;
        class Max_min{
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number of elements:");
                int n = scanner.nextInt();
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter a number:");
                    int number = scanner.nextInt();
                    if (number > max) {
                        max = number;
                    }
                    if (number < min) {
                        min = number;
                    }
                    

                }
                System.out.println("Maximum number is: " + max);
                System.out.println("Minimum number is: " + min);
                scanner.close();
            }
        }

