import java.util.Scanner;

public class WeatherTemperature {

    public static void main(String []args){

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter temperature: ");
        heat = input.nextInt();

        if(heat<5){
            System.out.println("You can go to ski");
        } else if (heat>=5 && heat <=25){
            if (heat <= 15) {
                System.out.println("You can go to cinema");
            }
            if (heat >=10){
                System.out.println("You can go to picnic");
            }
        }
        else
            System.out.println("You can go to swimming");

    }
}
