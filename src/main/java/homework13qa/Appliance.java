package homework13qa;

public class Appliance {
    private String name;
    private String made;
    private String model;
    private int year;


    public Appliance(String name,String made, String model, int year) {
        this.name = name;
        this.made = made;
        this.model = model;
        this.year = year;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
