import java.util.Scanner;

public class ContainsTheCharacter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int LIST = scnr.nextInt();
        String[] words = new String[LIST];
        String letter;
        int i;

        for (i = 0; i < LIST; ++i) {
            words[i] = scnr.next();
        }

        letter = scnr.next();

        for (i = 0; i < LIST; ++i) {
            if (words[i].contains(letter)) {
                System.out.println(words[i]);
            }
        }
    }
}
