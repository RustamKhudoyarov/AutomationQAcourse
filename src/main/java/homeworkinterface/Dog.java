package homeworkinterface;

public class Dog implements IAnimal {
    private String nickName;
    private int years;

    public Dog(String nickName, int years, String color) {
        this.nickName = nickName;
        this.years = years;
        this.color = color;
    }

    private String color;
    @Override
    public void soundAnimal() {
        System.out.println("Dog said - GAV-GAV");

    }



    @Override
    public void typeAnimal() {
        System.out.println("It is pet " + nickName);

    }
}
