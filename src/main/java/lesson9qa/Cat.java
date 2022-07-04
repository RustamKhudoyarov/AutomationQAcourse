package lesson9qa;

public class Cat {
    private String nickname;
    private String kind;
    private float weight;


    public void setNickname(String nickname){
        this.nickname = nickname;

    }
    public void  setKind(String kind) {
        this.kind = kind;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }

    ///getters
    public String getNickname(){
        return nickname;
    }
    public String getKind(){
        return kind;
    }

    public float getWeight(){
        return weight;
    }
    //default costructor
    public Cat(){}
    public Cat(String nickname, String kind, float weight){
        this.nickname = nickname;
        this.kind = kind;
        this.weight =weight;
    }

    // Methods
    public String soundCat(){
        return "may - maya";

    }




}
