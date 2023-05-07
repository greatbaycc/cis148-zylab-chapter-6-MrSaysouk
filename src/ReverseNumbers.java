import java.util.Scanner;

public class ReverseNumbers {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int[] userList = new int[20];
    int numElements;
    int i;

    numElements = scnr.nextInt();
    userList = new int[numElements];

    for (i = 0; i < numElements; ++i) {
      userList[i] = scnr.nextInt();
    }

    for (i = userList.length - 1; i >= 0; --i) {
      System.out.print(userList[i] + " ");
    }
    System.out.println();
  }
}
