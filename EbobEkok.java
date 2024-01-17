import java.util.Scanner;

public class EbobEkok {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter N1 number: ");
        int n1 = input.nextInt();

        System.out.print("Enter N2 number: ");
        int n2 = input.nextInt();
        int ebob =1;
        int ebob2 =1;

        int i=1;

        int k;

        //Greatest Common Divisor
        //From 0 to smallest number
        if (n1>n2){
                while(i <= n2){
                    if (n1%i ==0 && n2%i==0){
                        ebob =i;
                    }
                    i++;
            }

        }
        else{ while(i <=n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
                            }
        }
        System.out.println("Ebob: " + ebob);

        //From the smallest number to 0
        if (n1>n2){
            k=n2;
            while (k!=0){
                if (n1%k==0 && n2%k==0){
                    ebob2 =k;
                    break;
                }
                k--;
            }

        }else{k=n1;
            while (k!=0){
                if (n1%k==0 && n2%k==0){
                    ebob2 =k;
                    break;
                }
                k--;
            }

        }
        System.out.println("Ebob: " + ebob2);


        //Least Commo n Multiple

        int e=1;
        while(e !=(n1*n2)){
            if (e%n1 == 0 && e%n2 ==0){
                System.out.println("Ekok" +e);
                break;
            }
            e++;
        }
        System.out.println("Ekok: " + e);
        System.out.println("Ekok Formülü: (n1*n2)/ebob "+ ((n1*n2)/ebob));

    }
}
