import java.util.Arrays;
import java.util.Scanner;

public class SortingElementsinAnArray {

    public static void main (String []args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Array Dimension: ");
        int arrayLength = input.nextInt();
        int [] array = new int[arrayLength];

        System.out.println("Enter elements of the Array: ");
        for (int i=0; i <arrayLength;i++ ){
            System.out.print(i+1 +"th Element: ");
            int value = input.nextInt();
            array [i] = value;

        }

        Arrays.sort(array);

        System.out.println("Sorted: " + Arrays.toString(array));


    }

}
