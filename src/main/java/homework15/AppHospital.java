package homework15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppHospital {
    public static void main(String[] args) {
        List<Doctor> franciceDoctors = new ArrayList<>();
        franciceDoctors.add( new Doctor("Jon", "Red", Position.ORTHOPEDIST));
        franciceDoctors.add( new Doctor("Jery", "Asterd", Position.PHYSIOLOGY));
        franciceDoctors.add(new Doctor("Jane", "Doord", Position.SURGEON));
        franciceDoctors.add( new Doctor("Cristine", "Todd", Position.DIETITIAN));

        Map<Integer,String> franciceRooms = new HashMap<>();
        franciceRooms.put(1, "Orthopedic");
        franciceRooms.put(2, "Phyology");
        franciceRooms.put(3, "Surgeon");
        List<InsuranceCompanies> franciceInsuransies = new ArrayList<>();

            franciceInsuransies.add(0,InsuranceCompanies.CIGNA);
            franciceInsuransies.add(1,InsuranceCompanies.CVS);
            franciceInsuransies.add(2,InsuranceCompanies.HUMANA);

        Hospital myHospital = new Hospital();
        myHospital.setHospitalName("Dr. Francice");
        myHospital.setAddress(new Address("123 Road Street " , "NY" , "NY", 2345));
        myHospital.setDoctors(franciceDoctors);
        myHospital.setRooms(franciceRooms);
        myHospital.setAcceptedInsurance(franciceInsuransies);
        myHospital.setDoctors(franciceDoctors);

        //myHospital.printInfoHospitalAddress();
       // myHospital.printInsuranceCompanies();
        myHospital.printInfoHospital();


        }
}
