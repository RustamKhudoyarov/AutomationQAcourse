package lesson10qa;



public class AppQA10 {
    public static void main(String[] args){
        System.out.println("Java core. Lesson 10. Inheritance. ");

        Student ann = new Student("Ann", "Norman", 20,TypePerson.ADULT,TypeGender.FEMALE,Subjects.CHEMISTRY);
        System.out.println(ann.getMajor());
        System.out.println(ann.getLastName());
        Person ivan = new Person("Ivan", "Chan",24,TypePerson.ADULT, TypeGender.MALE);
        System.out.println(ivan.getLastName() + " " + ivan.getGender());

        Teacher mrForman = new Teacher("Eric", "Forman",67,Subjects.CHEMISTRY);
        System.out.println("Mr " + mrForman.getLastName() +" teach " + mrForman.getSubject());

        mrForman.setGender(TypeGender.MALE);

        System.out.println(mrForman.getGender());

        Subjects[] annSubjects ={Subjects.CS,Subjects.MATH,Subjects.FINANCE};
        ann.setSubjects(annSubjects);
        for(int i = 0; i< ann.getSubjects().length; i++)
        System.out.println(ann.getSubjects()[i]);
    }

}
