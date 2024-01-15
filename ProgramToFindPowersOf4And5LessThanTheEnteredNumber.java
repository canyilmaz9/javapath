import java.util.Scanner;

public class ProgramToFindPowersOf4And5LessThanTheEnteredNumber {

    public static void main(String []args){

        int number;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scan.nextInt();

        for (int i=1; i<= number; i*=4){
            System.out.println(i);
        }
        for (int i=1; i <= number; i*=5){
            System.out.println(i);
        }
        int i=1;
        System.out.println("--------");
        while(i<=number){

            double controller = Math.pow(4,i);

            if (controller <= number){
                System.out.println(controller);
            }

            else break;

            double controller2 = Math.pow(5,i);
            if (controller2 <= number){
                System.out.println(controller2);
            }

            else break;
            i++;

        }
    }
}


