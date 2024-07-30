import java.util.Scanner;

public class Kullanci {

    public static void maim(String[]args){
        String userName, password, sorgu, newPassword = null;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Parolanız: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Başarılı Giriş Yaptınız.");
        } else {
            System.out.print("Hatalı Giriş Yaptınız. Parolanızı sıfırlamak ister misiniz? y:yes, n:no");
            sorgu = input.nextLine();
            if (sorgu.equals("y")) {
                System.out.print("Yeni parola giriniz. Eski ve hatalı olan parola ile aynı olmamalı: ");
                newPassword = input.nextLine();
            }
            else {
                System.out.print("Program kapandı.");
            }
            if (newPassword.equals("java123") && newPassword.equals(password)) {
                ;
                System.out.println("Parola oluşturulamadı, lütfen başka şifre giriniz");
                System.out.print(" Yeni Parolayı tekrar giriniz: ");
                newPassword = input.nextLine();
            }
            else
            {
                System.out.println("Parola oluşturuldu");

            }




        }


    }
}