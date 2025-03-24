public class Patern1 {
    public static void main(String[] args) {

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print(i );
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i );
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j );
        // }
        // System.out.println();
        // }

        // int n = 5;
        // int count = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(count );
        // count++;
        // }
        // System.out.println();
        // }

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

}
