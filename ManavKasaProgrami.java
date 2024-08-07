import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main (String []args){

        double armut, elma, domates, muz, patlican;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        armut = inp.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        elma = inp.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        domates = inp.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muz = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        patlican = inp.nextDouble();

        double total = (armut * 2.14) + (elma * 3.67) + (domates * 1.11 ) + (muz * 0.95) + (patlican * 5.00);

        System.out.print("Toplam Tutar : " + total + " TL" );

    }
}
