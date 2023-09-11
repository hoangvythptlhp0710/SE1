package tut3;

import java.util.Scanner;

public class Ex5 {
    public static void divide(int[] a, int[] b) {
        int lengthOfA = a.length;
        int lengthOfB = b.length;

        try {
            for (int i = 0; i < lengthOfA; i++) {
                // check if any elements in array b is 0, throw arithmetic exception
                if (b[i] == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                // else, calculate and display result to the screen
                System.out.println(a[i] / b[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            // handling exception
            System.out.println("Error: " + e.getMessage());
            System.out.println("Do you want to quit (y/n)?");
            System.out.println("Enter 'y' to quit, 'n' to provide missing value: ");

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("y")) {
                System.out.println("Bye bye!");
                System.exit(0);
            }
            else {

                // calculate the number of value missing in array b
                int lengthOfMissingValue = lengthOfA - lengthOfB;
                int[] c = new int[lengthOfMissingValue + lengthOfB];
                for (int i = 0; i < lengthOfB; i++) {
                    c[i] = b[i];
                }
                // get missing value from user
                for (int i = 0; i < lengthOfMissingValue; i++) {
                    System.out.println("Enter missing value: ");
                    c[i + lengthOfB] = sc.nextInt();
                }
                // call divide method again
                divide(a, c);
            }
        }
    }

    public static void main(String[] args) {
        divide(new int[]{7, 2, 3, 4, 5}, new int[]{1, 2, 3, 4});
    }
}
