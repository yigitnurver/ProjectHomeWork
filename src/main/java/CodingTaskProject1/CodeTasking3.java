package CodingTaskProject1;

public class CodeTasking3 {
    public static void main(String[] args) {
        int[][]TwoDArray={
                {4,6,7},
                {9,18,16,10},
                {65,94,90,90,77},
        };

        for (int i = 0; i < TwoDArray.length; i++) {

            for (int j = 0; j < TwoDArray[i].length; j++) {

                if(TwoDArray[i][j]%2==0){
                    System.out.print(TwoDArray[i][j]+" ");
                }
            }
            System.out.println();

        }


    }
}
