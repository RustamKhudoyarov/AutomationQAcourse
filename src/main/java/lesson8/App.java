package lesson8;

public class App {
    public static void main(String[] args) {
        Person david = new Person();
        david.name ="David";
        david.lastName ="Khan";
        david.yearBirthday =1983;

        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName ="Norman";
        anna.yearBirthday = 1990;


        System.out.println("New person is " + david.name + " " + david.lastName + "  born " +david.yearBirthday );
        System.out.println("New person: " + anna.name + " " +anna.lastName);
        //-------------other class object -----//
        Vehicle myCar = new Vehicle();
        myCar.made ="Tyoota";
        myCar.model ="Tacoma";
        myCar.color = "red";
        myCar.dateMade = 2022;
        System.out.println("My car is " + myCar.color);

    }
}
