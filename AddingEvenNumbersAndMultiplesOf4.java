import java.util.Scanner;

public class AddingEvenNumbersAndMultiplesOf4 {

    public static void main(String []args){

        int number, total =0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        number = scan.nextInt();

        //Getting an odd number from user.
        while(number%2==0){
            System.out.print("Please, enter an odd number: ");
            number = scan.nextInt();
        }

        //Summing the numbers from 1 to entered numbers if these numbers are divided by 3 and 4.
        for (int i=1; i<=number; i++){

            if ((i % 4 == 0 )) {
                total +=i;
            }

        }
        System.out.println("Total: " + total);

    }
}
