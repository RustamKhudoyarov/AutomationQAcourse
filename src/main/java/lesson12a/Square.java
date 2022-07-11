package lesson12a;

public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }
@Override
    public void draw(){
        System.out.println("I draw square with side - " + a);
    }
}
