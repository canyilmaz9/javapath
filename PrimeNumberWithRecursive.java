import java.util.Scanner;

public class PrimeNumberWithRecursive {

    static boolean isPrime(int number, int i) {

        if (i ==1) {
            return true; //No positive number less than 1 is prime.
        }
        else {
            if (number %i ==0){
                return false; // it is not a prime number.
            } else
            return isPrime(number, i-1);
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 2) {
            System.out.println(number + " is a prime number!");
        } else {
            if (isPrime(number, number /2)){
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }


    }
}

            

    
    

