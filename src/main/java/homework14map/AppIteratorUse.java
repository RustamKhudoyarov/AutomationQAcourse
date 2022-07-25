package homework14map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppIteratorUse {
    public static void main(String[] args) {

        List<Person> people =new  ArrayList<>();
        people.add(new Person("Paul", 2009));
        people.add(new Person("Karl" , 1988));
        people.add(new Person("Marsha", 1978));
        people.add(new Person("Mary", 2000));
       people.add(new Person("Tyra", 2000));
        System.out.println(people.size());
        people.remove("Tyra");

        people.add(4, new Person("Vasya", 2009));

        Iterator<Person> iteratorPerson = people.listIterator();
        while (iteratorPerson.hasNext()){
            System.out.println(iteratorPerson.next().getName());
        }

        List<String> cars =new  ArrayList<>();
        cars.add("BMW");
        cars.add("VAZ");
        cars.add("KAMAZ");
        cars.add("ZIL");
        Iterator <String> itrCar = cars.iterator();
        while (itrCar.hasNext()){
            System.out.println(itrCar.next());
        }


    }
}
