import java.util.Arrays;

public class RepeatingEvenNumbers {

    static boolean isFind(int [] arr, int value){
        for (int i: arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main (String []args){

        int [] list = {2, 89, 78, 45, 5, 1, 99, 78, 44, 44, 96, 100, 104, 2, 104};
        int [] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i =0; i < list.length; i++){
            for (int j=0; j< list.length; j++){
                if ((i !=j)  && (list[i]==list[j]) &&((list[j]%2==0) &&list[i]%2==0)){
                    if (!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }

                }
            }
        }

        System.out.println(Arrays.toString(duplicate));
    }
}
