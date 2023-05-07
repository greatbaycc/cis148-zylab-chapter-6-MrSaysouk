import java.util.Scanner;

public class ElementsInRange {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int LIST = scnr.nextInt();
        int[] numbers = new int[LIST];
        int i;
        int low;
        int high;

        for (i = 0; i < LIST; ++i) {
            numbers[i] = scnr.nextInt();
        }

        low = scnr.nextInt();
        high = scnr.nextInt();

        for (i = 0; i < LIST; ++i) {
            if (numbers[i] >= low && numbers[i] <= high) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();
    }
}
