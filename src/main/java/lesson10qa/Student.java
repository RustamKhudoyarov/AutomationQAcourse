package lesson10qa;

public class Student extends Person{
//    private String name;
//    private String lastName;
//    private int age;
//    private TypeGender gender;
    private Subjects major;
    private Subjects[] subjects;

    public Subjects[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects[] subjects) {
        this.subjects = subjects;
    }



    public Student(String name, String lastName, int age,TypePerson typePerson, TypeGender gender, Subjects major) {
//        this.name = name;
//        this.lastName = lastName;
//        this.age = age;
//        this.gender = gender;
        super(name, lastName,age,typePerson,gender);
        this.major = major;
    }

    public Subjects getMajor() {
        return major;
    }

    public void setMajor(Subjects major) {
        this.major = major;
    }
}
