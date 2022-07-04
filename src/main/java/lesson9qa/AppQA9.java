package lesson9qa;


public class AppQA9 {
    public static void main(String[] args) {
        System.out.println("Lesson-9 Setter/Getter, Encapsulation, Constructors");
        Person david = new Person();
        david.setName("David");
        david.setLastName("Jones");
        david.setBirthYear(1995);
        System.out.println(david.getName() + " " + david.getLastName() + " " + david.getBirthYear());

        Emploee ann = new Emploee("Ann", "Joe", 2016 );
        ann.setJobTitle("Accounter");
        System.out.println(ann.getInfo());

    }
}
