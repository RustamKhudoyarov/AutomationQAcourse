package lesson10qa;

public class Teacher extends Person{

    private Subjects subject;

    public Teacher(String name, String lastName, int age, Subjects subject) {
        super(name,lastName,age);
        this.subject = subject;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }
}
