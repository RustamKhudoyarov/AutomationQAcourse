package lesson9qa;

public class Emploee {
    private String name;
    private String lastname;
    private int year;
    private String jobTitle;
    public Emploee(String name, String lastName, int year){
        this.name = name;
        this.lastname =lastName;
        this.year = year;

    }
    public Emploee(){}

    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    public String getInfo(){
        return "{ emploee : " + this.name
                + ", " + this.lastname + ", " + this.jobTitle + ", " +this.year
                + " }";
    }

}