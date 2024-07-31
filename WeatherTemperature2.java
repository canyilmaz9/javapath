import java.util.Scanner;

public class WeatherTemperature2 {

    public static void main(String []args){

        int heat;
        String option, option2, option3, option4;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        heat = input.nextInt();

        option = (heat <5) ? ("You can go to skiing"):("");

        option2 = (heat>=5 && heat <15) ? ("You can go to cinema"):("");

        option3 = (heat >= 15 && heat <=25 ) ? ("You can go to picnic"): ("");

        option4 = (heat > 25) ? ("You can go to swimming!"): ("");

        System.out.print(option + option2 + option3);
    }
}
