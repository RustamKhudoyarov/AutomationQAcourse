package lesson12qa;

public class MyDesktopLight implements IAmericanElectricalPlug, IBulbE27 {
    private String brand;
    private String name;

    public MyDesktopLight(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public MyDesktopLight() {
    }

    @Override
    public void americanPlug() {
        System.out.println("Keeping plug standard");
    }

    @Override
    public int innerVoltage(boolean checkStandard) {

        return 5;
    }

    @Override
    public void keepE27() {
        System.out.println("Standard bulb 27E" );

    }
}
