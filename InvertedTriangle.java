import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        //int j;
        int loopNumber = number;
        for (int i=1; i<=loopNumber; i++){

            for (int j=1; j <=number; j++){
                System.out.print("*");
            }
            number--;
            System.out.println();
        }
    }
}
