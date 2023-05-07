import java.util.Scanner;

public class TwoSmallest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int LIST = scnr.nextInt();
        int[] numbers = new int[LIST];
        int i;

        for (i = 0; i < LIST; ++i) {
            numbers[i] = scnr.nextInt();
        }

        int num1 = numbers[0];
        int num2 = numbers[1];
        int value;
        int x;

        if (num1 > num2) {
            x = num1;
            num1 = num2;
            num2 = x;
        }

        for (i = 2; i < LIST; ++i) {
            value = numbers[i];
            if (value < num1) {
                num2 = num1;
                num1 = value;
            }
            else if (value < num2) {
                num2 = value;
            }
        }

        System.out.println(num1 + " " + num2);
    }
}
