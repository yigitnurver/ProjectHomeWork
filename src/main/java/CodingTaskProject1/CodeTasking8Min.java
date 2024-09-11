package CodingTaskProject1;

public class CodeTasking8Min {
    public static void main(String[] args) {

        int[]array={4,6,16,21,45,78};

        int minimum=array[0];

        for (int i = 0; i < 6; i++) {

            if(array[i]<minimum){
                minimum=array[i];
            }
        }
        System.out.println(minimum);


    }
}
