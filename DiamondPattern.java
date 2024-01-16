import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args){

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a row number: ");
        number = input.nextInt();

        int midRow = number / 2 + 1;

        // Upper part of the diamond
        for (int i = 1; i <= midRow; i++) {
            for (int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = midRow - 1; i >= 1; i--) {
            for (int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
