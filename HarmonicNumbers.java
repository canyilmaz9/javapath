import java.util.Scanner;

public class HarmonicNumbers {

    public static void main(String []args){

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N number: ");
        number = input.nextInt();

        double result =0;

        for(int i =1; i<=number;i++){
            result += (1.0/i);
        }

        System.out.println("Result: " + result);

    }
}
