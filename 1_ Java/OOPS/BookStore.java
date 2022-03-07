public class BookStore {
    public static void main(String[] args) {
        Book book1 = new Book("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);
        Book book2 = new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
        Book book3 = new Book("Pat Conroy", "Beach Music", 9.50, 1996);

        System.out.println("Book details are\n");
        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor() + " (" + book1.getYearOfPublication() + ")");
        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor() + " (" + book2.getYearOfPublication() + ")");
        System.out.println("Book 3: " + book3.getTitle() + " by " + book3.getAuthor() + " (" + book3.getYearOfPublication() + ")");

    }
}

class Book{
    private String title;
    private String author;
    private double price;
    private int yearOfPublication;

    public Book(String title, String author, double price, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
    }
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

}
