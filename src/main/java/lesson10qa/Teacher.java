package lesson10qa;

public class Teacher extends Person{
//    private String name;
//    private String lastName;
//    private int age;
    private Subjects subject;

    public Teacher(String name, String lastName, int age, Subjects subject) {
//        this.name = name;
//        this.lastName = lastName;
//        this.age = age;
        super(name,lastName,age);
        this.subject = subject;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }
}
