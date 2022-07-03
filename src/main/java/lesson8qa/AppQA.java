package lesson8qa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AppQA{

    public static void main (String[] args){

        Book detective = new Book();
        detective.type = "Dtective1";
        detective.nameBook = "Unknown";
        detective.authorBook = "Agatha Cristy";
        detective.countPages = 134;
        detective.infoBook();
        // calc remain pages
        int remainP = detective.remainPages(45,detective.countPages);
        System.out.println("I reading  book " + detective.nameBook +". Remain gages + " + remainP);

        Reader person = new Reader();
        person.name ="Rick";
        person.lastName ="Pop";
        person.bookHold = detective.nameBook;
       // person.dateStart = LocalDate.parse("30.06.2022");
        int days =person.countDaysHold (person.dateStart);
        System.out.println("Reader " + person.name + " took book " + person.bookHold + " Count days " + days);


    }
}
