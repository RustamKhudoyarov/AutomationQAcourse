package lesson12qa;

import lesson7.SortArray;

public class AppQA12InterfacePolymorphism {
    public static void main(String[] args) {

        boolean isStandard =true;
        ElectricDevice  printer = new ElectricDevice("HP", "laserJet");




       int voltage =  printer.innerVoltage(isStandard);

        printer.americanPlug();
        System.out.println("Inner voltage : " + voltage);
        IAmericanElectricalPlug prn = new ElectricDevice("myprinter", "RTD ");
        IAmericanElectricalPlug myDeskTopLight = new MyDesktopLight("LightForLife" , "LT-27E");
        IAmericanElectricalPlug [] plugs ={prn, myDeskTopLight};
        for(IAmericanElectricalPlug plug : plugs){
          plug.americanPlug();
        }

    }
}
