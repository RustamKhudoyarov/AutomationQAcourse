package homework13qa;

import java.util.ArrayList;
import java.util.List;

public class AppHomework13 {
    public static void main(String[] args) {
        System.out.println("Homework 13 - ArrayList (wrapper classes -Integer,String" +
                " and Custom class .Excersize methods add/remove/get/foreach ...)");

        List<String> homeRooms = new ArrayList<>();
        homeRooms.add("Dining room ");
        homeRooms.add("living room");
        homeRooms.add("bathroom");
        homeRooms.add("bed room");
        homeRooms.add("bed room");
        homeRooms.add("kitchen");
        homeRooms.add("hall");
        System.out.println(homeRooms);
        List<String> subRooms = new ArrayList<>();
        subRooms.add("My Room");
        subRooms.add("Pantry");
        subRooms.add("bathroom Eric");
        for(String room : homeRooms){
            System.out.println(room);
        }
        System.out.println("____________________________");
        homeRooms.addAll(subRooms);
        for(int i =0; i< homeRooms.size();i++){
            System.out.println(homeRooms.get(i));
        }




        homeRooms.add(3, "closet");
        for(String r : homeRooms){
            System.out.println(r);
        }
       String oldRoom = homeRooms.remove(4);
        System.out.println(homeRooms);
        System.out.println(oldRoom);
        System.out.println(homeRooms.size());
        System.out.println(homeRooms.parallelStream().findFirst());

        System.out.println("--------Integer-----------");

        List<Integer> numbers = new ArrayList<>();
      int i =0;
        while (i< 10){
            numbers.add(i);
            i++;

        }
        System.out.println(numbers);
        List<Integer> evens = new ArrayList<>();
        for(Integer number : numbers){
            if(number%2==0){
                evens.add(number);
            }
        }
        System.out.println(evens);
        numbers.addAll(evens);
        i=0;
        while (i<numbers.size()) {
            System.out.println(numbers.get(i));
            i++;
        }

        for(i=0; i<=numbers.size(); i++){
            if(numbers.get(i)%2==0){
                System.out.println(numbers.get(i)%2);
                numbers.remove(numbers.get(i));
            }

        }

       System.out.println("List without even numbers: " + numbers + " " + numbers.size());
        System.out.println(2%2==0);

        //////////////////////Custom class Appliance/////////////////////////////////
        List <Appliance> myAppliance =new ArrayList<>();

        myAppliance.add(new Appliance("microwave", "GE", "GER45WP01",2005));
        myAppliance.add(new Appliance("stove", "Bosh", "BSH36GAS", 2017));
        myAppliance.add(new Appliance("fridge", "Whirpool", "WPL20344PR", 2020 ));
        String tmpName = myAppliance.get(1).getName();
        System.out.println(tmpName);


        for (Appliance appl : myAppliance){

            if(appl.getYear()>2005){
                System.out.println("New appliances " + appl.getName() + " brand " + appl.getMade() + "  model " + appl.getModel() + " year " + appl.getYear());
            } else {
                System.out.println("Its old applaince ");
                System.out.println( appl.getName() + " brand " + appl.getMade() + "  model " + appl.getModel() + " year " + appl.getYear());
            }

        }

        List<Integer> iterator =new ArrayList<>();
        for ( i=0; i<3; i++){
            iterator.add(i);
        }
        Integer u=0;
        while(iterator.size()>i) {
            System.out.println(myAppliance.get(iterator.size()) );
            i =  iterator.size() - 1;

        }





    }
}
