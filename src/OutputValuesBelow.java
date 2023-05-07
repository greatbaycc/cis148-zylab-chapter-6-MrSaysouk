import java.util.Scanner;

public class OutputValuesBelow {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];
        int userInput = scnr.nextInt();
        int i;
        int threshold;

        for (i = 0; i < userInput; ++i) {
            userValues[i] = scnr.nextInt();
        }

        threshold = scnr.nextInt();

        for (i = 0; i < userInput; ++i) {
            if (userValues[i] <= threshold) {
                System.out.print(userValues[i] + " ");
            }
        }

        System.out.println();
    }
}
