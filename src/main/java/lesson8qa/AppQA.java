package lesson8qa;

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
    }
}
