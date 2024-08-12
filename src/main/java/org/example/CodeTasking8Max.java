package org.example;

public class CodeTasking8Max {
    public static void main(String[] args) {
        int[]array={67,1,5,12,24};

        int largest=array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[i]>largest){
                largest=array[i];
            }

        }
        System.out.println(largest);




    }
}
