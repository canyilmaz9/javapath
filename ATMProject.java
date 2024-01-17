import java.util.Scanner;

public class ATMProject {
    public static void main(String []args){

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right =3;
        int balance = 1500;
        int select;

        while(right>0){
            System.out.print("Enter your username: ");
            userName = input.nextLine();

            System.out.print("Enter your password: ");
            password = input.nextLine();

            switch (userName) {

                case "patika":

                    switch (password){

                        case "dev123":
                            System.out.println("Hello, Welcome to Kodluyoruz Bank! ");

                            do {
                                System.out.println(
                                        "1 - Deposit money\n"+
                                                "2 - Withdraw money\n" +
                                                "3 - Balance Enquiry\n" +
                                                "4 - Exit");
                                System.out.print("Please enter your requested bank transaction: ");
                                select = input.nextInt();

                                switch (select){

                                    case 1:
                                        System.out.print("Amount of Money: ");
                                        int depositMoney = input.nextInt();
                                        balance +=depositMoney;

                                        System.out.println();
                                        break;

                                    case 2:
                                        System.out.print("Withdraw Amount of Money: ");
                                        int withDrawMoney = input.nextInt();
                                        String message = (withDrawMoney>balance) ? "Insufficient Balance":Integer.toString(balance = balance-withDrawMoney);

                                        System.out.println(message);
                                        System.out.println();
                                        break;
                                    case 3:
                                        System.out.print("Your balance: "+ balance);
                                        System.out.println();
                                        break;
                                }

                            } while(select !=4);

                            System.out.println("See you again!");
                            right = -1;
                            break;

                        default:
                            System.out.println("Wrong password. Try again!");
                    }
                    break;
                default:
                    System.out.println("Wrong username. Try again!");
                    right--;
                    switch (right){
                        case 0:
                            System.out.println("Your account is blocked, please contact with your bank.");
                            break;
                        case 1, 2:
                            System.out.println("Remaining right: " + right);
                            break;

                    }
            }




        }

    }
}
