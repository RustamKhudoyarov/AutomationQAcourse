package lesson9qa;

public class Dog {
    private String kind;
    private String color;
    private String nickName;
    private int age;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String  getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    //constructors
    public Dog(){}
    public Dog(String nickname, String color, int age){
        this.nickName=nickname;
        this.age =age;
        this.color =color;
    }
    public Dog(String nickname,  int age){
        this.nickName=nickname;
        this.age =age;
    }

    // method
    public String soundDog(){
        return "Gav-gav-Gav";

    }
    public void guardOwner(){
        System.out.println("dog protecting owner");
    }
}
