import java.util.Scanner;

public class AdvancedCalculator {

    static void plus(){
        Scanner input = new Scanner(System.in);
        int number, result =0, i = 1;
        while(true){
            System.out.println("Enter 0 as an input if you want to exit from this operation");
            System.out.print(i++ + "th number : ");
            number = input.nextInt();
            if (number ==0){
                break;
            }
            result +=number;

        }
        System.out.println("Result: "+ result);
    }

    static void minus(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter?: ");
        int counter = input.nextInt();
        int number, result =0;

        for (int i=1; i<= counter; i++){
            System.out.println(i + " th number: ");
            number = input.nextInt();
            if (i==1){
                result +=number;
                continue;
            }
            result -=number;

        }
        System.out.println("Result: " + result);

    }
    static void times(){
        Scanner input = new Scanner(System.in);
        int number, result =1, i=1;

        while(true){
            System.out.println("Enter 0 as an input if you want to exit from this operation");
            System.out.print(i++ + "th number: ");
            number = input.nextInt();
            if (number ==0){
                result =0;
                break;
            }
            result *=number;
        }
        System.out.println("Result: " + result);

    }
    static void divided(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many number do you want to enter?: ");
        int counter = input.nextInt();
        double number, result =0.0;

        for (int i=1; i <=counter; i++){
            System.out.print(i+ " th number: ");
            number = input.nextDouble();
            if (i!=1 && number ==0){
                System.out.println("Divider cannot be 0!");
                continue;
            }
            if (i ==1){
                result =number;
                continue;
            }
            result /=number;
        }
        System.out.println("Result: " + result);
            }
    static void power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base value");
        int base = input.nextInt();

        System.out.print("Enter a exponent value");
        int exponent = input.nextInt();

        if (exponent ==0) {
            int result = 1;
        }
       int result =1;

        for (int i=1; i<=exponent; i++){

            result *=base;
            }
        System.out.println("Result: " + result);
    }
    static void factorial(){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number ==0){
            int result =1;
        }
        int result =1;
        for (int i=1; i<=number;i++){
            result *=i;
        }
        System.out.println("Result: " + result);
    }

    static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter a divider: ");
        int divider = input.nextInt();
        String isDivider = (divider ==0) ? "Divider can not be 0":"Divider is " + divider;

        int mod = number % divider;

        System.out.println("Result: " + mod);
    }
    static void rectangle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a : long side of the rectangle: ");
        int longSide = input.nextInt();

        System.out.print("Enter a short side of the rectangle: ");
        int shortSide = input.nextInt();

        int perimeter = 2 * (longSide + shortSide);
        int area = longSide * shortSide;

        System.out.println("Perimeter of the Rectangle: " + perimeter);
        System.out.println("Area of the Rectangle: " + area);
    }

    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Summation Process\n"
                + "2- Subtraction Process\n"
                + "3- Multiplication\n"
                + "4- Division Operation\n"
                + "5- Exponent Number Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Getting a mod\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "0- Exit\n";
        do   {
            System.out.println(menu);
            System.out.print("Please enter operation: ");
            select = scan.nextInt();

            switch (select){

                case 0:
                    System.out.println("You wanted to exit");
                    break;
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Invalid operation, please try again.");
            }

        }while (select !=0);

    }
}
