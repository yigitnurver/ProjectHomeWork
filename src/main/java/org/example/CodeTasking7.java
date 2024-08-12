package org.example;

public class CodeTasking7 {
    public static void main(String[] args) {

        int n=10;
        int first=0;
        int second=1;
        int next=0;

        for (int i = 0; i < n; i++) {
            next=first+second;
            first=second;
            second=next;
            System.out.println(next);

        }

    }
}
