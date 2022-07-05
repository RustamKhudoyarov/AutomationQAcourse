package lesson10qa;

public class Person {
    protected String name;
    protected String lastName;
    protected int age;
    protected TypePerson typePerson;
    protected TypeGender gender;

    public Person() {
        
    }

    public Person(String name, String lastName, int age) {
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }


    public TypeGender getGender() {
        return gender;
    }

    public void setGender(TypeGender gender) {
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public TypePerson getTypePerson() {
        return typePerson;
    }

    public void setTypePerson(TypePerson typePerson) {
        this.typePerson = typePerson;
    }
  public Person(String name, String lastName, int age, TypePerson typePerson, TypeGender gender){
        this.name =name;
        this.lastName =lastName;
        this.age =age;
        this.typePerson =typePerson;
        this.gender = gender;
    }

}
