import java.util.Scanner;

public class TaksimetreHesaplayanProgram {

    public static void main(String[]args)
    {
        //Degiskenler tanımlandı.
        int Taksimetreacilisücreti, minimumödenecektutar, km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        km = girdi.nextInt();

        total = (km * perKm);
        total += startPrice;
        total = (total < 20) ? 20 : total;
        System.out.print("Toplam Tutar: " + total);

    }
}
