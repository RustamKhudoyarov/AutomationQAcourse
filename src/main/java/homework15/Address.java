package homework15;

public class Address {
    private String streetAddress;
    private String town;
    private String state;
    private int zip;

    public void setStreetAddress(String streetAddress){
        this.streetAddress =streetAddress;
    }
    public String getStreetAddress(){
        return streetAddress;
    }
    public void setTown(String town){
        this.town = town;
    }
    public String getTown(){ return town;}
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
    public void setZip(int zip){
        this.zip = zip;
    }
    public int getZip(){
        return zip;
    }
    public Address(String streetAddress,String town, String state, int zip){
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;

    }


}