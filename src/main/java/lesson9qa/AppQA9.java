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
        ann.setJobTitle(TypeJobTitle.ACCOUNTER);
        System.out.println(ann.getInfo());


        Pet myPet = new Pet();
        myPet.setNickName("Drug");
        myPet.setTypePet("dog");
        myPet.setAge(2);
        myPet.setHealthStatus(true);
        myPet.setWeigth(7000);
        System.out.println(myPet.getTypePet() + " . Name is " + myPet.getNickName() + "His weight is " + myPet.getWeigth() );
        // feed dog
        System.out.println("I feed my dog " + myPet.getNickName());
       float weightTemp = myPet.feedPet(345,myPet.getWeigth());
        System.out.println("Now my dog " + myPet.getNickName()+ " is weight " + myPet.feedPet(345,myPet.getWeigth()));
        System.out.println("We went to walk. And now his weight is " + myPet.walkPet(weightTemp, 40) );



    }
}
