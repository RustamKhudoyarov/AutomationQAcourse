package lesson12a;

public class Rectangle implements IShape {
    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("I draw rectangle with lenght " + a + " and width " + b);
    }

    @Override
    public double getPerimeter() {
        return 2*(a + b);
    }

    @Override
    public double getArea() {
        return a* b;
    }
}
