import java.util.Scanner;

public class Sinifgecme {

    public static void main(String[] args){

        int matematik, fizik, turkce, kimya, muzik, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        if ((matematik >=0 && matematik<=100)){
            total += matematik;
        }
        if ((fizik >=0 && fizik<=100)) {
            total += fizik ;
        }
        if ((turkce >=0 && turkce<=100)) {
            total += turkce ;
        }
        if ((kimya >=0 && kimya<=100)) {
            total += kimya ;
        }
        if ((muzik >=0 && muzik<=100)) {
            total += muzik ;
        }
        double average = total / 5;

        if (average <= 55){
            System.out.println("Sınıfta kaldınız!");
        } else System.out.println("Sınıfı geçtiniz!");

        System.out.println("Ortalamanız: " + average);
    }
}
