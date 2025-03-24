public class Sum {

    public static void main(String[] args) {
        int n = 29;
        int sum;
        int r;
        while (true) {
            sum = 0;
            while (n > 0) {
                r = n % 10;
                sum = sum + r;
                n = n / 10;

            }
            if (sum > 9) {
                n = sum;                
            }
            else{
                System.out.println("Sum of digits = " + sum);
                break;
            }
        }
    }
}
