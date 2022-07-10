package lesson11qa;

public class House {
    private Address address;
    private Person owner;
    private int rooms;
    private int baths;
    private int yearBuild;

    public House(Address address, Person owner, int rooms, int baths, int yearBuild) {
        this.address = address;
        this.owner = owner;
        this.rooms = rooms;
        this.baths = baths;
        this.yearBuild = yearBuild;
    }

    public Address getAddress() {
        return this.address;
    }

    public Person getOwner() {
        return this.owner;
    }

    public int getRooms() {
        return this.rooms;
    }

    public int getBaths() {
        return this.baths;
    }

    public int getYearBuild() {
        return this.yearBuild;
    }
}
