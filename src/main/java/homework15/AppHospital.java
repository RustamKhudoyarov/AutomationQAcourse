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

        myHospital.printInfoHospital();

        // new hospital

        Hospital stDaviceHospital = new Hospital();
        stDaviceHospital.setAddress(new Address("156 WestRoad", "Round Rock", "TX", 78566));
        stDaviceHospital.setHospitalName("St. Davice Hospital");
        List<Doctor> stDaviceDoctors = new ArrayList<>();
        stDaviceDoctors.add(new Doctor("Harry", "Tomas", Position.SURGEON));
        stDaviceDoctors.add(new Doctor("Lory", "Jordan", Position.ORTHOPEDIST));
        stDaviceDoctors.add(new Doctor("Peter", "Horn", Position.SURGEON));
        Map<Integer, String> stDaviceRooms = new HashMap<>();
        stDaviceRooms.put(1,"Orthopedic");
        stDaviceRooms.put(2, "Physiology");
        stDaviceRooms.put(3,"SURGERY");
        List<InsuranceCompanies> stDaviceInsurancies = new ArrayList<>();
        stDaviceInsurancies.add(InsuranceCompanies.CIGNA);
        stDaviceInsurancies.add(InsuranceCompanies.HCSC);
        stDaviceHospital.setAcceptedInsurance(stDaviceInsurancies);
        stDaviceHospital.setRooms(stDaviceRooms);
        stDaviceHospital.setDoctors(stDaviceDoctors);

        List<Hospital> arrHopitals = new ArrayList<>();
        arrHopitals.add(stDaviceHospital);
        arrHopitals.add(myHospital);
        int countSurgein =0;
        for(Hospital hospital : arrHopitals){
            for (Doctor doc : hospital.getDoctors()){
                System.out.println(doc.getPosition());
                    if (doc.getPosition() == Position.SURGEON )
                    {

                        countSurgein++;
                        System.out.println(hospital.getDoctors().listIterator().next().getPosition()  + " " + hospital.getHospitalName());
                    }

            }

           }
        System.out.println("------------------------------------------");
        for(Hospital tmpHospital: arrHopitals){
            tmpHospital.printInfoHospital();

        }

        }




//        for (Hospital hosp : arrHopitals){
//            boolean tmp;
//            if( hosp.getDoctors().iterator().next().getPosition()==Position.SURGEON){
//                countSurgein ++;
//
//            }
//            System.out.println(countSurgein + " " + hosp.getHospitalName());
//        }


//        }
}
