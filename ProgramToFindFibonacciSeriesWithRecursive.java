public class ProgramToFindFibonacciSeriesWithRecursive {
    static int fib(int number){
            if (number == 1 || number ==2){
                return 1;
            }

       return fib(number-1) + fib(number-2);
    }
    public static void main(String []args){

        // 1 1 2 3 5 8 13 21 34

        System.out.println(fib(5));

    }
}
