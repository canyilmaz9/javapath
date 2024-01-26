import java.util.Arrays;

public class RepeatingNumbers {

    public static void main(String []args){

        int [] array = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Repeated Numbers");

        for (int i=0; i< array.length; i++){
            // If this element has been processed before, continue
            if (array[i] == -1) {
                continue;
            }

            int count = 1; // Assume that there is at least one number
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    // Let's mark the previously processed elements
                    array[j] = -1;
                }
            }

            //Print the frequency of the element
            System.out.println(array[i] + " number repated " + count + " times! ");
        }


    }


}
