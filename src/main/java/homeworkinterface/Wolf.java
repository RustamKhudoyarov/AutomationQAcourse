package homeworkinterface;

public class Wolf implements IAnimal {
    private String kind;
    private int age;

    public Wolf(String kind, int age) {
        this.kind = kind;
        this.age = age;
    }

    @Override
    public void soundAnimal() {
        System.out.println("Wolf said - RRRRR -AYU" );
    }



    @Override
    public void typeAnimal() {
        System.out.println("Wolf is wild animal . It's " + kind);

    }
}
