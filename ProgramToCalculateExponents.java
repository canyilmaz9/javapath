import java.util.Scanner;

public class ProgramToCalculateExponents {

    public static void main(String []args){

        int n,k, total=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Base Number: ");
        n = input.nextInt();

        System.out.print("Exponent Number: ");
        k = input.nextInt();

        for (int i=1; i<=k; i++){
            total *=n;
        }
        System.out.println("Total: "+ total);
    }
}
