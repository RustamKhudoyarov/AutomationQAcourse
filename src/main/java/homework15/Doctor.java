package homework15;

import java.util.List;
import java.util.Map;


public class Doctor {
    private String name;
    private String lastName;
    private Position position;

    public Doctor(String name, String lastName, Position position){

        this.name = name;
        this.lastName = lastName;
        this.position = position;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLastNmae(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void  setPosition(Position position){
        this.position =position;
    }
    public Position getPosition(){
        return position;
    }

    // method print info about doctor

}
