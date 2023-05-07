import java.util.Scanner;

public class MiddleItem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userVals = new int[9];  // Set of data specified by the user
        int userInput;
        int midVal;
        int i = 0;

        userInput = scnr.nextInt();

        while (userInput >= 0) {
            if (i == userVals.length) {
                System.out.println("Too many inputs");
            }
            userVals[i] = userInput;
            ++i;
            userInput = scnr.nextInt();
        }
        midVal = userVals[i / 2];
        System.out.println(midVal);
    }
}