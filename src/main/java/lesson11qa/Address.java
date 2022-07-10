package lesson11qa;

public class Address {

    private String addressLine1;
    private String city;
    private State state;
    private String zip;

    public Address(String addressLine1, String city, State state, String zip) {
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void setState(State state){
        this.state =state;
    }

    public State getState(){
        return this.state;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
