package lesson8qa;

public class App {
    public static void main (String[] args){

        Book detective = new Book();
        detective.type = "Dtective";
        detective.nameBook = "Unknown";
        detective.authorBook = "Agatha Cristy";
        detective.countPages = 134;
        detective.infoBook();
    }
}
