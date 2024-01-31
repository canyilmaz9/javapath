import java.util.Scanner;

public class MinefieldGame {
    public static void main(String []args) {

        int row;
        int column;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter diagonal row and column numbers and greater than 2");
            System.out.print("Enter a row number: ");
            row = input.nextInt();
            System.out.print("Enter a column number: ");
            column = input.nextInt();
        } while (((row < 2) ||(column < 2)) || (row != column));

        MineSweeper mine = new MineSweeper(row, column);
        mine.run();

    }
}
