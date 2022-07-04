package lesson9qa;

public class Person {
    private String name;
    private String lastName;
    private int birthYear;

    // setter
    public void setName(String name){
        this.name =name;
    }
    //getter
    public String  getName(){
        return this.name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setBirthYear(int birthYear){
        if( birthYear>2021 || birthYear<1900) { //1995
            throw new IllegalArgumentException("wrong year");
        }else {
            this.birthYear = birthYear;
        }
    }
    public int getBirthYear(){
        return birthYear;
    }
    /// constructors - прототип объекта




}

