public class ArrayDemo {
    public static void main(String[] args) {
        // [0, 10, 20, 30, 40, 50, 60, 70, 80, 90]

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 90) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.println("]");
    }
}

