import java.util.Scanner;

public class PrimeNumberBetween1And100 {

    public static void main(String []args){

        System.out.println("Prime numbers between 1 and 100");

        int counter = 0;
        for (int i=2; i<=100; i++){


            //Check wheter the number is prime or not
            for(int j=2; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                    break;
                }
            }
                //Print the prime number if it is found

                if (counter ==0){

                    System.out.print(i + " ");
                }
                counter =0;

        }

    }
}
