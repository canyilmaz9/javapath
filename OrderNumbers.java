import java.util.Scanner;
public class OrderNumbers {

    public static void main(String []args){
        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        a = inp.nextInt();

        System.out.print("Enter second number (b): ");
        b = inp.nextInt();

        System.out.print("Enter third number (c): ");
        c = inp.nextInt();

        if ((c<a) &&(c<b)){
             if ((b<a)){
                 System.out.println("c < b < a ");
             } else
                 System.out.println("c < a < b");
        }


        if ((b<a) &&(b<c)){
            if ((c<a)){
                System.out.println("b < c < a ");
            } else
                System.out.println("b < a < c");
        }


        if ((a<b) &&(a<c)){
            if ((c<b)){
                System.out.println("a < c < b ");
            } else
                System.out.println("a < b < c");
        }


        }


}
