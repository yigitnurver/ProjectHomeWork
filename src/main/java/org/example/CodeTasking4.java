package org.example;

import java.sql.SQLOutput;

public class CodeTasking4 {
    public static void main(String[] args) {
        int[][]numbers= {
                {10,20,30},
                {9,18,16,10},
                {65,94,90,90,77},
        };

        int oddsum=0;
        int evensum=0;

        for(int[]row:numbers){
            for(int n:row){
                if(n%2==0){
                    evensum+=n;
                }else{
                    oddsum+=n;
                }
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
