import java.util.Scanner;

public class FibonacciSeries {

    public static void main (String []args){

        Scanner input = new Scanner(System.in);
        System.out.print("With how many element do you want to run this series?: ");
        int number = input.nextInt();

        int a =0, b= 1;
        //Print first two elements
        System.out.print("Fibonacci Series of " + number + " elements: " + a + " " + b + " ");

        //Generate remaining elements of the series

        for (int i=2; i<=number; i++){

            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

    }
}
