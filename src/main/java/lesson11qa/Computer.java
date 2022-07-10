package lesson11qa;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Computer {
    protected String brand;
    protected String model;
    private SystemBlock systemBlock;
    private KeyBoard keyBoard;
    private Mouse mouse;
    private Monitors monitor;


    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public SystemBlock getSystemBlock() {
        return this.systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }

    public KeyBoard getKeyBoard() {
        return this.keyBoard;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public Monitors getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitors monitor) {
        this.monitor = monitor;
    }

    public Computer(){}
    public Computer(String brand, String model){this.brand=brand; this.model=model;}
    public Computer(String brand, String model, SystemBlock systemBlock, KeyBoard keyBoard, Mouse mouse, Monitors monitor) {
        this.brand = brand;
        this.model = model;
        this.systemBlock = systemBlock;
        this.keyBoard = keyBoard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    // print info about Computer
    public void pintComputerInfo(Computer computer){
        System.out.println("Parameters computer: brand - " + computer.getBrand() +" model - " + computer.getModel());
        System.out.println("\t\t System block: CPU " +computer.getSystemBlock().getMotherBoard().getCpu().getBrand()
                +" " + computer.getSystemBlock().getMotherBoard().getCpu().getModel());
        System.out.println("\t\t Disk: " +computer.getSystemBlock().getDisk().getBrand()
                + " " + computer.getSystemBlock().getDisk().getModel());
        System.out.println("\t\t Mother board: " + computer.getSystemBlock().getMotherBoard().getBrand()
                + " " + computer.getSystemBlock().getMotherBoard().getModel());
        System.out.println("\t\t\t\t\t Frequency - " + computer.getSystemBlock().getMotherBoard().getFrequencyBus() + " MHz");
        System.out.println("\t\t\t\t\t RAM - " + computer.getSystemBlock().getMotherBoard().getRam().getBrand()
                + " " + computer.getSystemBlock().getMotherBoard().getRam().getModel()
                + " - " + computer.getSystemBlock().getMotherBoard().getRam().getSize() + " Mb");
        System.out.println("\t\t\t\t\t Cooler - " + computer.getSystemBlock().getMotherBoard().getCooler().getBrand()
                + " " + computer.getSystemBlock().getMotherBoard().getCooler().getModel()
                + " " + computer.getSystemBlock().getMotherBoard().getCooler().getSpeed() + " RPM");
        System.out.println("\t\t Keyboard: " + computer.getKeyBoard().brand + " " + computer.getKeyBoard().getModel()
                + " " + computer.getKeyBoard().getTypeUsing() + " " + computer.getKeyBoard().getTypeWire());
        System.out.println("\t\t Mouse: " + computer.getMouse().brand + computer.getMouse().getModel()
                + " " + computer.getMouse().getTypeMouse() + " " + computer.getMouse().getTypeWires());
        System.out.println("\t\t Monitor: " + computer.getMonitor().brand + " " + computer.getMonitor().model
                + " " + computer.getMonitor().getTypeMatrix() + " " + computer.getMonitor().getDiagonal()
                + " " + computer.getMonitor().getTypeConnector());


    }
}
