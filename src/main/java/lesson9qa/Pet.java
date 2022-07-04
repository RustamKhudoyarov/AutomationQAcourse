package lesson9qa;

public class Pet {
    private String nickName;
    private String typePet;
    private int age;
    private float weigth;
    private boolean healthStatus;
    private final float MAX_WEIGHT =1200;
    private final float MIN_WEIGHT = 1000;

    //setter
    public void setNickName(String nickName){
        this.nickName=nickName;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }



    public void setTypePet(String typePet){
        this.typePet =typePet;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHealthStatus(boolean healthStatus){
        this.healthStatus=healthStatus;
    }

    // getters
    public String getNickName(){
        return nickName;
    }
    public String getTypePet(){
        return typePet;
    }
    public int getAge(){
        return age;
    }

    public boolean isHealthStatus(){
        return healthStatus;
    }
    // methods
// feed  pet
    public float feedPet(float feed, float weigth) {
        this.weigth = getWeigth();
        if (feed == 0 && weigth < MAX_WEIGHT) {
            throw new IllegalArgumentException("no food or you gave more food for pet!" + "status haelth - " + isHealthStatus());

        }
        weigth = weigth + feed;
        return weigth;
    }
    // walk pet
    public float walkPet(float weigth, int meters){
        if(meters<0){
            weigth = weigth;
        }if(meters>=40){
            weigth = weigth - 30;
        } if (meters>=100){
            weigth =weigth - 50;
        }
        if (weigth<1000){
            throw new IllegalArgumentException("Your pet is sick. Go home and feed your pet!");
        }
        return weigth;

    }


}
