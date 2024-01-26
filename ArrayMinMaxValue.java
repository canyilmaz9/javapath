import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMaxValue {

    public static void main(String [] args){
        int [] list = {56, 34, 1, 8, -2, -32};

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int min = list[0];
        int max = list[0];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your desired value: ");
        int value = input.nextInt();

        for (int i=0; i <list.length; i++){

            if ((list[i] <=value) && (value <=list[i+1])){
                min = list[i];
                max = list[i+1];
                break;
            }
        }

        System.out.print("The closest number smaller than the entered number: " +min);
        System.out.println();
        System.out.print("The closest number greater than the entered number: " +max);
    }
}
