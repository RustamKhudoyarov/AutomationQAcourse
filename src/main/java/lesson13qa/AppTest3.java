package lesson13qa;

import java.util.ArrayList;
import java.util.List;

public class AppTest3 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        List <Integer> nums = new ArrayList<Integer>();
        nums.add(1);

        List<Person> people = new ArrayList<Person>();
        Person igor = new Person("Igor", "Jackson" , 2006);
        people.add(igor);
        people.add(new Person("Anna", "Hiris", 1995));
        System.out.println(people.get(1).getName());
    }
}
