

class sumarr{
    //wap program to read marks5 sub from user and print sun,avg,max,min
    public static void main(String[] args) {
        int[] marks = {10, 20, 30, 40, 50};
        int sum = 0;
        int max = marks[0];
        int min = marks[0];
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
            if (marks[i] > max) {
                max = marks[i];
            }
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        System.out.println("Sum of marks: " + sum);
        System.out.println("Average of marks: " + sum / marks.length);
        System.out.println("Max of marks: " + max);
        System.out.println("Min of marks: " + min);
    }
}

    



//program to print only prime numbers of array
