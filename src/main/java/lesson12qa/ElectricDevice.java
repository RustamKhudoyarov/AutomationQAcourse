package lesson12qa;

public class ElectricDevice implements IAmericanElectricalPlug {
    private String brand;
    private String name;

    public ElectricDevice(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public void print(String str){
        System.out.println("My printer " + name + " " + brand + " its for print :" + str);
    }

    @Override
    public void americanPlug() {

        System.out.println("Your device has - american outlet interface");

    }

    @Override
    public int innerVoltage(boolean isAmericanStandard) {
        if(isAmericanStandard){
            return 120;
        } else
        return 220;
    }
}
