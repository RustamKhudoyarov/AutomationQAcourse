package lesson11qa;

public class PowerSupply {
    private String brand;
    private String model;
    private int powerValue;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerValue() {
        return powerValue;
    }

    public void setPowerValue(int powerValue) {
        this.powerValue = powerValue;
    }

    public PowerSupply(String brand, String model, int powerValue) {
        this.brand = brand;
        this.model = model;
        this.powerValue = powerValue;
    }
}
