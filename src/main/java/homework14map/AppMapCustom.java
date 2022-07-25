package homework14map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AppMapCustom {
    public static void main(String[] args) {

        Map<Person, Pet> petOwner = new HashMap<>();
        petOwner.put(new Person("Oleg", 2009), new Pet("Nick", "dog"));
        petOwner.put(new Person("Jon", 1986), new Pet("Hat", "cat"));
        System.out.println(petOwner.size());

        for(Map.Entry<Person, Pet> pet: petOwner.entrySet()){
            System.out.println("Owner is " +pet.getKey().getName() + " has a "+ pet.getValue().getKind() + ". Pet name is " + pet.getValue().getNickname());
        }

        Set<Person> uniqName = new HashSet<>();
        uniqName.add(new Person("Iren", 2000));
        uniqName.add(new Person("Irina", 1987));
        uniqName.add((new Person("Mike", 1989)));
        uniqName.add((new Person("Mike", 1989)));
        for(Person tst : uniqName){
            System.out.println(tst.getName());
        }






    }
}
