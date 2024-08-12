package org.example;

public class CodeTasking30 {
    public static void main(String[] args) {
        int[][]numbers={
                {10,20,30},
                {9,18,16,10},
                {65,94,90,90,77},
        };


        for(int[]row:numbers){
            for(int n:row){
                if(n%2==0){
                    System.out.print(n+" ");
                }
            }
            System.out.println();
        }
    }
}
