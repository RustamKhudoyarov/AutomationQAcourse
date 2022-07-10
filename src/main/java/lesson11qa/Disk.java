package lesson11qa;

public class Disk {
    private String brand;
    private String model;
    private int size;
    private TypeDisk typedisk;

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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public TypeDisk getTypedisk() {
        return typedisk;
    }

    public void setTypedisk(TypeDisk typedisk) {
        this.typedisk = typedisk;
    }

    public Disk(String brand, String model, int size, TypeDisk typedisk) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.typedisk = typedisk;
    }
}
