package CodingTaskProject1;

public class CodeTasking9 {
    public static void main(String[] args) {

        int[]numbers={124,145,177,373,536,484};

        int largest=numbers[0];
        int secondlargest=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largest){
                secondlargest=largest;
                largest=numbers[i];
            }else if(numbers[i]>secondlargest){

            }

        }
        System.out.println(secondlargest);

    }

}
