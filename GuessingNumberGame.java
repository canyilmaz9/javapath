import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main (String []args){
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int [] wrong = new int [5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5){

            System.out.print("Please enter your guess: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Please enter a value between 0-100.");
                if (isWrong){
                    right++;
                    System.out.println("You attempted wrong so many times. Your right is: " + (5- right));
                } else {
                    isWrong = true;
                    System.out.println("In your next invalid attempt, your rights will be decreased!");
                }
                continue;
            }

            if (selected == number){
                System.out.println("Congradulations, correct guess! Your guessing is: " + number);
                isWin = true;
                break;
            } else {

                System.out.println("You entered wrong value ! ");
                if (selected > number){
                    System.out.println(selected + " is greater than secret number. ");
                } else {
                    System.out.println(selected + " is less than secret number. ");
                }
                wrong[right++] = selected;
                System.out.println("You have " + (5 - right) + " right. " );
            }

        }
        if (!isWin){
            System.out.println("You lost! ");
            if (!isWrong){
                System.out.println("Your guesses are: " + Arrays.toString(wrong));
            }

        }

    }
}
