import java.util.Scanner;

public class HesapMakinesi {

    public static void main (String[] args){


        int a,b, select, result;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci Sayıyı giriniz: ");
        b = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminizi Yapınız:");
        select = input.nextInt();

        switch (select){
            case 1:
                result = (a+b);
                System.out.println("Sonuc: " + result);
                break;
            case 2:
                if (a>b) {
                result = (a - b);
            } else {
                    result = (b-a);
                }
                System.out.println("Sonuc: " + result);
                break;
            case 3:
                result = (a*b);
                System.out.println("Sonuc: " + result);
                break;
            case 4:
                if(a>b)
                result = (a/b);
                else {
                    result = (b/a);
                }
                System.out.println("Sonuc: " + result);
                break;
            default:
                System.out.println("1,2,3,4 rakamlarından birini giriniz.");
        }

    }

}
