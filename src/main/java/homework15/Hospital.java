package homework15;


import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, String> rooms;
    private List<InsuranceCompanies> acceptedInsurance;

    public void setHospitalName(String hospitalName){
        this.hospitalName=hospitalName;

    }
    public String getHospitalName(){
        return hospitalName;
    }
    public void setAddress(Address address){
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }

    public void setDoctors(List<Doctor> doctors){
        this.doctors = doctors;
    }
    public List<Doctor> getDoctors(){
        return doctors;
    }
    public void setRooms(Map<Integer, String> rooms){
        this.rooms = rooms;

    }
    public Map<Integer, String > getRooms(){
        return rooms;
    }

    public void setAcceptedInsurance (List<InsuranceCompanies> acceptedInsurance){
        this.acceptedInsurance = acceptedInsurance;

    }
    public List<InsuranceCompanies> getAcceptedInsurance(){
        return acceptedInsurance;
    }
    public Hospital(){}
    public Hospital(String hospitalName, Address address,
                    List<Doctor> doctors, Map<Integer, String> rooms ,
                    List<InsuranceCompanies> acceptedInsurance){


    }





    /// methods print all fields hospital

public void printInfoHospital() {
        printInfoHospitalAddress();
        printInfoDoctors();
        printInfoRooms();
        printInsuranceCompanies();
        }



    public void printInfoHospitalAddress() {
        System.out.println("Hospital name : " + getHospitalName());
        System.out.println("Address : " + getAddress().getStreetAddress() + ", " + getAddress().getTown() +
                ", " + getAddress().getState());
    }
    // Info Doctors and tittles
    public void printInfoDoctors(){
        System.out.println("List doctors and titles ");
        for(Doctor doctor : doctors){
            System.out.println("\t\t Position " + doctor.getPosition() + " name: "
                                +  doctor.getName() + " lastname: " + doctor.getLastName());
        }
    }
    //  printout rooms
    public void printInfoRooms(){
        System.out.println("List rooms: ");
            for(Map.Entry<Integer, String > room : rooms.entrySet()){
                 System.out.println("\t\troom number: " + room.getKey() + " name " + room.getValue());
            }
    }

    public void printInsuranceCompanies(){
        System.out.println("List insurance companies: ");

            for (InsuranceCompanies insurance : acceptedInsurance) {
                System.out.println("\t\t " + insurance);
            }
        }




}
