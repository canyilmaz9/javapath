import java.util.Scanner;

public class LargestAndSmallestNumber {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter?: ");
        int n = input.nextInt();
        int i;
        int biggestNumber;
        int smallestNumber;

        System.out.print("Enter first number number:");
        i = input.nextInt();
        int j = 2;
        do{
            System.out.print("Enter "+j+" th number: ");
            int k = input.nextInt();
            if (i>k){
                biggestNumber =i;
                smallestNumber =k;
            }
            else {
                smallestNumber = i;
                biggestNumber = k;
            }

                j++;
        }
        while(j !=n+1);

        System.out.println("The biggest number: " + biggestNumber);
        System.out.println("The smallest number: " + smallestNumber);


    }
}
