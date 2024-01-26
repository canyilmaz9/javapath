public class WritingBwithMultipleArrays {

    public static void main (String [] args){

        String [][] letter = new String[5][4];

        for (int i=0; i<letter.length; i++){
            for (int j=0; j<letter[i].length; j++){
                if (j==0){
                    letter[i][j] = " * ";
                } else if ((i==0 || i==2 || i== 4)&& ((j==1)||(j==2) )){
                    letter[i][j] = " * ";
                } else if (((i==1)||(i==3))&& (j==3)){
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "  ";
                }


            }
        }


        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[0].length; j++) {
                System.out.print(letter[i][j] + " ");
            }
            System.out.println();
        }

    }
}
