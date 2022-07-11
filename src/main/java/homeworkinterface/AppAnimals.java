package homeworkinterface;

public class AppAnimals {
    public static void main(String[] args) {

        IAnimal dogJock = new Dog("Jock", 3, "red");
        IAnimal wlfKind1 = new Wolf("coyote", 2);
        Dog charle =new Dog("Charle", 1,"black");
        Wolf wlfKind = new Wolf("Ethiopian wolf", 5);

        IAnimal[] animals = {dogJock,wlfKind,wlfKind1,charle};
        for(IAnimal animal:animals){
            animal.typeAnimal();
        }


    }
}
