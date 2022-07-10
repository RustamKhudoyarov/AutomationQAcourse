package lesson11qa;

public class CPU {
    private String brand;
    private String model;
    private int frequency;

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

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public CPU(String brand, String model, int frequency) {
        this.brand = brand;
        this.model = model;
        this.frequency = frequency;
    }
}

