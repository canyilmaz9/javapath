import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Subtraction5andAdd5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number, N: ");
        int n = scanner.nextInt();

        recursiveMethod(n);
    }

    static void recursiveMethod(int originalN) {
        recursiveHelper(originalN, originalN);
    }

    static void recursiveHelper(int originalN, int currentN) {
        // Writing the number
        System.out.print(currentN + " ");

        // Recursive
        if (currentN > 0) {
            // Continue subtracting as long as the number is positive
            recursiveHelper(originalN, currentN - 5);
        } else {
            // Proceed to addition when number is negative or 0
            recursiveAddition(originalN, currentN + 5);
        }
    }

    static void recursiveAddition(int originalN, int currentN) {
        System.out.print(currentN + " ");

        // Recursive
        if (currentN < originalN) {
            //Continue adding as long as the number is less than or equal to the initial value
            recursiveAddition(originalN, currentN + 5);
        }
    }
}
