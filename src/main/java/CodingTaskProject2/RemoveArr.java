package CodingTaskProject2;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveArr {
    public static void main(String[] args) {
        ArrayList<String>items=new ArrayList<>();
        items.add("bulb");
        items.add("screwdriver");
        items.add("screw");
        items.add("hammer");
        items.add("rock");
        items.add("rope");
        items.add("screwdriver");
        items.add("knife");
        items.add("hammer");
        items.add("rock");


        ArrayList<String>items1=new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {

            if(!items1.contains(items.get(i))){
                items1.add(items.get(i));
            }
        }
        System.out.println(items1);
    }
}
