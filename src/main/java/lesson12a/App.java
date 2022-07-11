package lesson12a;

public class App {
    public static void main(String[] args) {

        Circle myCircle = new Circle(5.2);
        myCircle.draw();
//        System.out.println(myCircle.getArea());
//        System.out.println(myCircle.getPerimeter());
        Rectangle rec = new Rectangle(2.3,3.3);
        rec.draw();
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
        Rectangle r2 = new Square(3);
        Circle c3 = new Circle(5);
        Rectangle r4 =new Rectangle(4,5);
        IShape r3 = new Rectangle(3.4,5);
        IShape c6 = new Circle(9.8);
        IShape r8 = new Square(6);
        IShape [] shapes = {myCircle,rec, r2, c3, r4, r3, c6, r8};
        for (IShape shape: shapes){
            shape.draw();
        }

        }


    }

