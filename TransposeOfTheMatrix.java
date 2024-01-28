import java.util.Arrays;

public class TransposeOfTheMatrix {

        public static void main(String[] args) {
            System.out.println("Finding Transpose Of The Matrix");
            System.out.println("------------------------");
            int[][] array = {
                    {1, 2, 3},
                    {4, 5, 6},
            };

            System.out.println("Matrix: ");
            for (int i = 0; i <array.length; i++)
            {
                for (int j = 0; j<array[i].length;  j++)
                {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println( "");
            }

            System.out.println("Transpose: ");
            for (int i = 0; i < array[0].length; i++)
            {
                for (int j = 0; j < array.length; j++)
                {
                    System.out.print(array[j][i] + " ");
                }
                System.out.println("");
            }
        }
}
