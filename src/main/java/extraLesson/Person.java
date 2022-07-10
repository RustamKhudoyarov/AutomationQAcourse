package extraLesson;

public class Person {

    protected String name;
    protected String lastNmae;
    protected int year;

    public Person(String name, String lastNmae, int year) {
        this.name = name;
        this.lastNmae = lastNmae;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastNmae='" + lastNmae + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLastNmae() {
        return lastNmae;
    }

    public int getYear() {
        return year;
    }

    // Override
    public  void hello(){
        System.out.println("Hello");
    }
}
