import java.util.Scanner;

public class FactorialAndCombination {

    public static void main(String []args){

        //n! = 1*2*3*4*5*...*n
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter combination number: ");
        int n = scan.nextInt();

        System.out.print("Enter r element number: ");
        int r = scan.nextInt();

        int nFactorial =1;
        int nMinusRFactorial =1;
        int rFactorial =1;

        int combination;

        //n!
        for (int i =1; i <=n; i++){
            nFactorial *= i;
        }
        //(n-r)!
        for (int i =1; i <=(n-r); i++){
            nMinusRFactorial *= i;
        }

        //(r)!
        for (int i =1; i <=r; i++){
            rFactorial *= i;
        }

        combination = nFactorial / (rFactorial*(nMinusRFactorial));

        System.out.println("Combination of " + n +" in "+ r + " is equal to "+combination);
    }
}
