package lesson8qa;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Reader  {
    public String name;
    public String lastName;
    public String bookHold;
    public LocalDate dateStart;

  public int countDaysHold(LocalDate dateStrt){
      DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd.MM.yyyy");
      LocalDate start = LocalDate.parse("30.06.2022", formatter);
      //LocalDate start = LocalDate.parse(dateStrt, formatter);
      LocalDate end = LocalDate.now();
      Period period = Period.between(start,end);
      return period.getDays();


  }
}
