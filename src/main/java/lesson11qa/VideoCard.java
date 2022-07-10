package lesson11qa;

public class VideoCard extends Computer{
    private int sizeRam;

    public int getSizeRam() {
        return sizeRam;
    }

    public void setSizeRam(int sizeRam) {
        this.sizeRam = sizeRam;
    }

    public VideoCard(String brand, String model, int sizeRam) {
        super(brand , model);
        this.sizeRam = sizeRam;
    }
}


