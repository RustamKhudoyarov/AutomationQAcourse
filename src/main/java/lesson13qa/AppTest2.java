package lesson13qa;

import java.util.ArrayList;

public class AppTest2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> subcolors = new ArrayList<>();
        subcolors.add("Magenta");
        subcolors.add("Cyan");
        colors.add("Blue");
        System.out.println(colors);
        colors.add("Red");
        colors.add("White");
        System.out.println(colors);
        System.out.println(colors.get(1));
        colors.add("Green");
        colors.add("red");
        System.out.println(colors);
        System.out.println(colors.size());
        colors.set(4, "Pink");
        System.out.println(colors);
        colors.add("Green");
        colors.add(1, "Green");
        System.out.println(colors);
        colors.addAll(subcolors);
        System.out.println(colors);
        System.out.println(colors.size());
        String oldColor = colors.set(1,"Brown");
        System.out.println(oldColor);
        System.out.println(colors);
        oldColor = colors.remove(3);
        System.out.println(oldColor);
        System.out.println(colors);
        colors.remove("Green");
        System.out.println(colors);
        for(String color : colors){
            System.out.println(color);
        }
        System.out.println("other for by index");

        for (int i=0; i<colors.size();i++ ) {
            System.out.println(colors.get(i));
        }



    }
}
