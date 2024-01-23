import java.util.Scanner;

public class CalculatingExponentsWithRecursiveMethods {
    static int recursive(int base, int exponent){

        if (exponent==1){
            return base;
        }
        else {
            return base * (recursive(base, exponent -1));
        }

    }
    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        System.out.print("How many tmimes do you want to calculate exponents with recursive methods?: ");
        int number = input.nextInt();


        while (number !=0){

            System.out.print("Enter a base: ");
            int base = input.nextInt();

            System.out.print("Enter a exponent: ");
            int exponent = input.nextInt();

            System.out.println(base + " to the power of " + exponent + " is equal to " +recursive(base,exponent));
            number --;
        }

    }
}
