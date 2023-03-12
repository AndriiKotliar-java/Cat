package SEMESTR2.Lesson20.BookShop.Model;

public class Book {
  private long unNumber;
  private String name;
  private String author;

    public Book(long unNumber, String name, String author, int price, BookGenre genre) {
        this.unNumber = unNumber;
        this.name = name;
        this.author = author;
        this.price = price;
        Genre = genre;
    }

    public long getUnNumber() {
        return unNumber;
    }

    public void setUnNumber(long unNumber) {
        this.unNumber = unNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BookGenre getGenre() {
        return Genre;
    }

    public void setGenre(BookGenre genre) {
        Genre = genre;
    }

    private int price;
  private BookGenre Genre;
}
