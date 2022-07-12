package lesson13qa;

public class Person {
    private String name;
    private String NastName;
    private int year;

    public Person(String name, String nastName, int year) {
        this.name = name;
        NastName = nastName;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNastName() {
        return NastName;
    }

    public void setNastName(String nastName) {
        NastName = nastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
