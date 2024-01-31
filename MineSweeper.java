import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int row, column, size;
    int[][] map;
    int[][] board;
    boolean game = true;

    Random rand = new Random();
    Scanner input = new Scanner(System.in);

    MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.map = new int[row][column];
        this.board = new int[row][column];
        this.size = this.row * this.column;
    }

    public void run(){
         int row, col, success = 0;
         prepareGame();
        System.out.println("The game has started.");
        while (game){
            print(board);
            System.out.print("Enter a row: ");
            row = input.nextInt();
            System.out.print("Enter a column: ");
            col = input.nextInt();

            if (row < 0 || row >= this.row)
            {
                System.out.println("Invalid row number");
                continue;
            }
            if (col <0 || col >= this.column)
            {
                System.out.println("Invalid column number");
                continue;
            }
            if (map[row][col] !=-1)
            {
                check(row,col);
                success++;
                if (success == (size - (size/4)))
                {
                    System.out.println("Congradulations, You win! ");
                    break;
                }
            }
            else
            {
                game = false;
                System.out.println("Game Over! ");
            }

        }

    }

    public void check (int r, int c)
    {
         if (map[r][c] == 0)
         {
             if ((c<column -1 ) && (map[r][c+1] == -1))
             {
                 board[r][c]++;
             }
             if ((r<row -1) && (map[r+1][c] == -1))
             {
                 board[r][c]++;
             }
             if ((r>0) && (map[r-1][c] == -1))
             {
                 board[r][c]++;
             }
             if ((c>0)&& (map[r][c-1] == -1))
             {
                 board[r][c]++;
             }
             if(board[r][c] == 0)
             {
                 board[r][c] = -2;
             }

         }


    }

    public void prepareGame(){

        int randRow, randColumn, count =0;
        while (count != this.size / 4){

            randRow = rand.nextInt(this.row);
            randColumn = rand.nextInt(this.column);
            if (map[randRow][randColumn] != -1)
            {
                    map[randRow][randColumn] = -1;
                    count++;

            }
        }
    }

    public void print(int [][] arr){
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                if(arr[i][j] >= 0)
                {
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
