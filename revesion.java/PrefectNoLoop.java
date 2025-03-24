public class PrefectNoLoop {
    public static void main(String[] args) {
        for (long n = 6; n <= 6000; n++) {
            int sum = 0;
            for (int j = 1; j < n; j++) {
                if (n % j == 0) {
                    sum += j;
                }
            }

            if (sum == n) {
                System.out.println(n + " is a perfect number.");
            }
            // else{
            //     System.out.println(n + " is not a perfect number.");
            // }
        }
    }
}