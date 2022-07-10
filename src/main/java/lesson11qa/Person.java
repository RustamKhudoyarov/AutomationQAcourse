package lesson11qa;

public class Person {
    private Address adress;
    private String name;
    private String lastName;
    private int yearBirth;

    public Person(Address adress, String name, String lastName, int yearBirth) {
        this.adress = adress;
        this.name = name;
        this.lastName = lastName;
        this.yearBirth = yearBirth;
    }

    public Address getAdress() {
        return this.adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
}
