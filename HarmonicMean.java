public class HarmonicMean {

    public static void main (String [] args){

        int [] number = {1, 2, 3, 4, 5};
        double sum =0;
        for (int i: number){
            sum += (double) 1 /i;
        }
        double harmonicMean = number.length / sum;

        System.out.println("Harmonic Mean: " + harmonicMean);
    }
}
