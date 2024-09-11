package CodingTaskProject1;

public class CodeTasking1 {
    public static void main(String[] args) {

        int[]temperatures={93,86,94,94,95,92,92};

        int maximum=temperatures[0];

        for (int i = 0; i < temperatures.length; i++) {

            if(temperatures[i]>maximum){
                maximum=temperatures[i];

            }

        }
        System.out.println(maximum); // maximum temperature


        int minimum=temperatures[0];

        for (int i = 0; i < temperatures.length; i++) {

            if(temperatures[i]<minimum){
                minimum=temperatures[i];
            }

        }
        System.out.println(minimum); // minimum temperature




    }

}
