package CodingTaskProject1;

public class CodeTasking10 {
    public static void main(String[] args) {

        String[] colors={"green","blue","red","red"};

        for (int i = 0; i < colors.length; i++) {
            for (int j = i; j < colors.length; j++) {

                if(colors[i].equals(colors[j]) && i!=j){
                    System.out.println(colors[i]);
                }

            }

        }
    }
}
