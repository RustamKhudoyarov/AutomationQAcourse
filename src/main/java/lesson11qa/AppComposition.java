package lesson11qa;

import javax.sound.midi.Soundbank;

// Create 2 computers and print info about CPU model and made
public class AppComposition {
    public static void main(String [] args){
        System.out.println("Composition");

        //Computer acer = new Computer("Acer" , "ACR-2500" );
        KeyBoard microsoft = new  KeyBoard("Microsoft", "ms-20",TypeWires.WIRELESS,"Standard");
        Mouse logitechMouse = new Mouse("Logitech", "JR-23",TypeWires.WIRELESS, TypeMouse.GAMING);
        Cooler samsungCooler = new Cooler("Samsung", "sms-1500",1500);
        Cooler interCooler = new Cooler("InterCool", "cl-3000",3000);
        CPU cpuIntel = new CPU("Intel","Core i7", 2500);
        CPU cpuAMD = new CPU("AMD", "Ryzen", 5000);
        Disk diskSeagate = new Disk("Seagate", "SG-512Gb" , 512,TypeDisk.HHD);
        Disk diskSamsung = new Disk("Samsung", "SMS-1000Gb",1000,TypeDisk.SSD);
        Monitors lgMonitor = new Monitors( "LG", "LG23","LCD",23, "HDMI");
        Monitors samsungMonitor = new Monitors( "Samsung", "SMS24","LCD",24, "IPS");
        PowerSupply apcPowerSupply = new PowerSupply("APC" , "PW350", 350);
        PowerSupply pwrPowerSupply = new PowerSupply("PWR" , "P500", 500);
        RAM kingstonRam = new RAM("Kingston", "ram-2048", 2048 );
        RAM intelRam = new RAM("Intel", "Int4096", 4096 );
        VideoCard radionVideoCard = new VideoCard("ATI", "ATIRadion",512);
        VideoCard gforceVideoCard = new VideoCard("NVIDEO", "GFORCE-1024",1024);
        MotherBoard acerMotherBoard = new MotherBoard("Intel", "880-HRT",kingstonRam,cpuIntel,880,interCooler);
        MotherBoard hpMotherBoard =new MotherBoard("Lenove", "LEN-1200", intelRam, cpuAMD,1200,samsungCooler);

        SystemBlock acerSystemBlock = new SystemBlock(diskSamsung,acerMotherBoard,radionVideoCard,apcPowerSupply);
        SystemBlock hpSystemBlock = new SystemBlock(diskSeagate,hpMotherBoard,gforceVideoCard,pwrPowerSupply);
        Computer acer = new Computer("Acer", "ACR-2500",acerSystemBlock,microsoft,logitechMouse,samsungMonitor);
        acer.pintComputerInfo(acer);
        System.out.println("------------------------------");
        Computer hp = new Computer("HP", "Pavilion",hpSystemBlock,microsoft,logitechMouse,lgMonitor);
        hp.pintComputerInfo(hp);




        Address davidAddress = new Address("12 Elm rd", "Austin" , State.TX , "78623");
        Person david = new Person(davidAddress, "David" , "Alt" , 1967);
        String streetAddressOfDavid = david.getAdress().getAddressLine1();
        System.out.println(streetAddressOfDavid);
        House houseDavid = new House(davidAddress,david,5,3,2022);
        streetAddressOfDavid = houseDavid.getOwner().getAdress().getAddressLine1();
        System.out.println(streetAddressOfDavid);


        System.out.println(acer.getSystemBlock().getVideoCard().model);






    }
}
