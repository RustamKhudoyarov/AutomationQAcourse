package lesson11qa;

public class MotherBoard extends Computer{
    private RAM ram;
    private CPU cpu;
    private int frequencyBus;
    private Cooler cooler;

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public int getFrequencyBus() {
        return frequencyBus;
    }

    public void setFrequencyBus(int frequencyBus) {
        this.frequencyBus = frequencyBus;
    }

    public Cooler getCooler() {
        return cooler;
    }

    public void setCooler(Cooler cooler) {
        this.cooler = cooler;
    }

    public MotherBoard(String brand, String model, RAM ram, CPU cpu, int frequencyBus, Cooler cooler) {
        super(brand, model);
        this.ram = ram;
        this.cpu = cpu;
        this.frequencyBus = frequencyBus;
        this.cooler = cooler;
    }
}
