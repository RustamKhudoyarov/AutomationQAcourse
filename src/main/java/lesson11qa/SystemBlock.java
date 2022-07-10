package lesson11qa;

public class SystemBlock {

    private Disk disk;
    private MotherBoard MotherBoard;
    private VideoCard videoCard;
    private PowerSupply powerSupply;

    public SystemBlock() {

    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public lesson11qa.MotherBoard getMotherBoard() {
        return MotherBoard;
    }

    public void setMotherBoard(lesson11qa.MotherBoard motherBoard) {
        MotherBoard = motherBoard;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public SystemBlock(Disk disk, MotherBoard motherBoard, VideoCard videoCard, PowerSupply powerSupply) {
        this.disk = disk;
        this.MotherBoard = motherBoard;
        this.videoCard = videoCard;
        this.powerSupply = powerSupply;
    }
}
