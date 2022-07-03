package lesson8qa;

public class Book {
    public String nameBook;
    public String authorBook;
    public String type;
    public int countPages;

    public void infoBook(){
        System.out.println("Name book: " + nameBook + " \nauthor: " +authorBook +" \ntype book: " + type + " \ncount pages: " +countPages);
    }
    public int remainPages(int readCount, int totalPages){

        return totalPages - readCount;
    }
}
